package com.osf.romanvintonyak.WSDummy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Set;

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
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;

public class SoapHandler implements SOAPHandler<SOAPMessageContext> {
	public static final String ROOT = "return";

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = (Boolean) context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// if this is an incoming message from the client
		if (isRequest) {
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
				JAXBElement<AssessmentCatalogQueryType> jb = unmarshaller.unmarshal(xsr, AssessmentCatalogQueryType.class);
				AssessmentCatalogQueryType query = jb.getValue();
				xsr.close();
			} catch (Exception e) {
				throw new BadXmlException(); 
			}

		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		throw new BadXmlException(); 
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
