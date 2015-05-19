package com.osf.romanvintonyak.WSDummy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.Exception.InvalidDataException;

public class SoapHandler implements SOAPHandler<SOAPMessageContext> {
	public static final String ROOT = "AssessmentCatalogQuery";

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// if this is an incoming message from the client
		if (!outbound) {
			SOAPMessage message = context.getMessage();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			try {
				
				message.writeTo(out);
				String strMsg = new String(out.toByteArray());
				StringReader reader = new StringReader(strMsg);
				XMLInputFactory xif = XMLInputFactory.newFactory();
				XMLStreamReader xsr = xif.createXMLStreamReader(reader);
				xsr.nextTag();
				while (!xsr.getLocalName().equals(ROOT)) {
					xsr.nextTag();
				}
				JAXBContext jc = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
				Schema schema = sf.newSchema(new File("D:/java/WSGetStarted/src/main/resources/AssessmentCatalogQuery.xsd")); 
				unmarshaller.setSchema(schema);
				JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(xsr, AssessmentCatalogQueryType.class);
				xsr.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new InvalidDataException("Your data is not valid!");
			}
		}
		return true;
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
