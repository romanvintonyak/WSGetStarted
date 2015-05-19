package com.osf.romanvintonyak.WSDummy;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.Exception.InvalidDataException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.jws.WebParam;
import javax.xml.bind.*;
import javax.xml.bind.util.JAXBSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

@ServiceMode(Service.Mode.PAYLOAD)
@WebServiceProvider(serviceName = "LearningActivityHttpService"
        , portName = "LearningActivityRawXml")
public class EndpointProvider implements Provider<Source> {
    @Override
    public Source invoke(@WebParam(name = "AssessmentCatalogQuery",targetNamespace = "http://ns.hr-xml.org/2007-04-15") final Source source) {
        JAXBContext inContext = null;
        JAXBContext outContext = null;
        Unmarshaller unmarshaller = null;
        Marshaller marshaller = null;
        Source outSource=null;
        try {
            inContext = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
            outContext = JAXBContext.newInstance(AssessmentCatalogType.class);
            unmarshaller = inContext.createUnmarshaller();
            JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(source, AssessmentCatalogQueryType.class);
            AssessmentCatalogQueryType catalogQuery = jb.getValue();
            CatalogDatasourceMock datasourceMock = new CatalogDatasourceMock();
            AssessmentCatalogType assessmentCatalogType = datasourceMock.getData().get(catalogQuery);
            marshaller = outContext.createMarshaller();
            // Create the Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();

            // Marshal the Object to a Document
            marshaller.marshal(assessmentCatalogType, document);
            outSource = new DOMSource(document);
        } catch (Exception e){
            throw new InvalidDataException("test message");
        }
        return outSource;
    }
}