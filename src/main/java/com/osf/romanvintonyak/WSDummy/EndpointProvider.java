package com.osf.romanvintonyak.WSDummy;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentPackageType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.dao.ClientDao;
import com.osf.romanvintonyak.WSDummy.entities.Client;
import com.osf.romanvintonyak.WSDummy.entities.Test;
import com.osf.romanvintonyak.WSDummy.entities.User;
import com.osf.romanvintonyak.WSDummy.services.AuthorizationService;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.Provider;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@WebServiceProvider(serviceName = "EndpointProviderService")
@HandlerChain(file = "/handler.xml")
public class EndpointProvider implements Provider<Source> {

    public static final String XML_XSD = "/xml.xsd";
    private static final String PROVIDER_NOT_FOUND = "Provider was not found";
    private static final String SCHEMA_NAME = "/AssessmentCatalogQuery.xsd";
    private static final String INVALID_CREDENTIALS = "Invalid user credentials";
    private static final String INVALID_DATA = "Your data is not valid!";

    @Resource
    private WebServiceContext context;
    @EJB
    private ClientDao clientDao;

    @EJB
    private AuthorizationService authorizationService;


    @Override
    @WebMethod
    public Source invoke(@WebParam(name = "AssessmentCatalogQuery", targetNamespace = "http://ns.hr-xml.org/2007-04-15") Source input) {
        //clientDao.initTestData();
        User user = authorizationService.getGetUserFromHeader(context);
        if (user == null || !authorizationService.isAuthorized(user)) {
            throw new RuntimeException(INVALID_CREDENTIALS);
        }
        Source output;
        try {
            //Try to get the input query
            AssessmentCatalogQueryType query = convertSourceToQuery(input);
            long queryId = Long.parseLong(query.getClientId().getIdValue().get(0).getValue());
            Client client = clientDao.getById(queryId);
            //Reply with error message
            if (client == null) {
                throw new RuntimeException(PROVIDER_NOT_FOUND);
            }
            //build AssessmentCatalogType from Query and Client
            AssessmentCatalogType assessmentCatalog = buildCatalogFromQueryAndClient(query, client);
            output = convertCatalogToSource(assessmentCatalog);
        } catch (JAXBException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();//TODO Logging
            throw new RuntimeException(INVALID_DATA);
        }
        return output;
    }

    private Source convertCatalogToSource(AssessmentCatalogType assessmentCatalogType) throws JAXBException, ParserConfigurationException {
        JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentCatalogType.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        // Create the Document
        Document document = getDocument();
        // Marshal the Object to a Document
        marshaller.marshal(assessmentCatalogType, document);
        Source source = new DOMSource(document);
        return source;
    }


    private AssessmentCatalogQueryType convertSourceToQuery(Source source) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Schema schema = getSchema();
        unmarshaller.setSchema(schema);
        JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(source, AssessmentCatalogQueryType.class);
        return jb.getValue();
    }


    private Schema getSchema() throws SAXException {
        List<Source> schemas = new ArrayList<>();
        schemas.add(new StreamSource(getClass().getResourceAsStream(XML_XSD)));
        schemas.add(new StreamSource(getClass().getResourceAsStream(SCHEMA_NAME)));
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(schemas.toArray(new Source[schemas.size()]));
        return schema;
    }

    private Document getDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }

    private AssessmentCatalogType buildCatalogFromQueryAndClient(AssessmentCatalogQueryType query, Client client) {
        AssessmentCatalogType catalog = new AssessmentCatalogType();
        String providerValue = query.getProviderId().getIdValue().get(0).getValue();
        catalog.setProviderId(new EntityIdType());
        catalog.getProviderId().getIdValue().add(new IdValue(providerValue));
        Set<Test> tests = client.getTests();
        for (Test test : tests) {
            AssessmentPackageType assessmentPackage = new AssessmentPackageType();
            assessmentPackage.setPackageId(new EntityIdType());
            assessmentPackage.getPackageId().getIdValue().add(new IdValue(test.getDisplayName()));
            assessmentPackage.setName(test.getName());
            catalog.getAssessmentPackage().add(assessmentPackage);
        }
        return catalog;
    }


}