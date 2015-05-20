package com.osf.romanvintonyak.WSDummy;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.Exception.InvalidDataException;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Set;

public class SoapHandler implements SOAPHandler<SOAPMessageContext> {
	public static final String ROOT = "AssessmentCatalogQuery";
	private static final String schemaName = "/AssessmentCatalogQuery.xsd";

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// if this is an incoming message from the client
		if (!outbound) {
			XMLStreamReader xsr = null;
			SOAPMessage message = context.getMessage();
			try {
				xsr = getXmlStreamReader(message);
				Schema schema = getSchema();
				unmarshallerQuery(xsr, schema);
				xsr.close();
			} catch (Exception e) {
				e.printStackTrace();//TODO logging
				throw new InvalidDataException("Your data is not valid!");
			}
		}
		return true;
	}

	private void unmarshallerQuery(XMLStreamReader xsr, Schema schema) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		unmarshaller.setSchema(schema);
		JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(xsr, AssessmentCatalogQueryType.class);
	}

	private XMLStreamReader getXmlStreamReader(SOAPMessage message) throws SOAPException, IOException, XMLStreamException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		message.writeTo(out);
		String strMsg = new String(out.toByteArray());
		StringReader reader = new StringReader(strMsg);
		XMLInputFactory xif = XMLInputFactory.newFactory();
		XMLStreamReader xsr = xif.createXMLStreamReader(reader);
		xsr.nextTag();
		while (!xsr.getLocalName().equals(ROOT)) {
            xsr.nextTag();
        }
		out.close();
		return xsr;
	}

	private Schema getSchema() throws SAXException {
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		StreamSource streamSource = new StreamSource(getClass().getResourceAsStream(schemaName));
		return sf.newSchema(streamSource);
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
