package com.osf.romanvintonyak.WSDummy;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.Entities.Client;
import com.osf.romanvintonyak.WSDummy.Entities.User;
import com.osf.romanvintonyak.WSDummy.Services.AuthorizationService;
import com.osf.romanvintonyak.WSDummy.dao.ClientDao;
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

@WebServiceProvider(serviceName = "EndpointProviderService")
@HandlerChain(file = "/handler.xml")
public class EndpointProvider implements Provider<Source> {

    private static final String PROVIDER_NOT_FOUND = "Provider was not found";
    private static final String SCHEMA_NAME = "/AssessmentCatalogQuery.xsd";
    private static final String INVALID_CREDENTIALS = "Invalid user credentials";
    private static final String INVALID_DATA = "Your data is not valid!";

    @Resource
    private WebServiceContext context;
    @EJB
    ClientDao clientDao;

    @EJB
    AuthorizationService authorizationService;


    @Override
    @WebMethod
    public Source invoke(@WebParam(name = "AssessmentCatalogQuery", targetNamespace = "http://ns.hr-xml.org/2007-04-15") Source input) {
        clientDao.fillTestData();
//        User user = authorizationService.getGetUserFromHeader(context);
//        if (user == null || !authorizationService.isAuthorized(user)) {
//            throw new RuntimeException(INVALID_CREDENTIALS);
//        }
        Source output;
        try {
            AssessmentCatalogType assessmentCatalog = unmarshallerQuery(input);
            if (assessmentCatalog == null) {
                throw new RuntimeException(PROVIDER_NOT_FOUND);
            }
            output = marshallerCatalog(assessmentCatalog);
        } catch (JAXBException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();//TODO Logging
            throw new RuntimeException(INVALID_DATA);
        }
        return output;
    }

    private Source marshallerCatalog(AssessmentCatalogType assessmentCatalogType) throws JAXBException, ParserConfigurationException {

        JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentCatalogType.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        // Create the Document
        Document document = getDocument();
        // Marshal the Object to a Document
        marshaller.marshal(assessmentCatalogType, document);
        Source source = new DOMSource(document);
        return source;
    }


    private AssessmentCatalogType unmarshallerQuery(Source source) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Schema schema = getSchema();
        unmarshaller.setSchema(schema);
        JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(source, AssessmentCatalogQueryType.class);
        AssessmentCatalogQueryType catalogQuery = jb.getValue();
        CatalogDatasourceMock datasourceMock = new CatalogDatasourceMock();
        return datasourceMock.getData().get(catalogQuery);
    }


    private Schema getSchema() throws SAXException {
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        StreamSource streamSource = new StreamSource(getClass().getResourceAsStream(SCHEMA_NAME));
        return sf.newSchema(streamSource);
    }

    private Document getDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }


}