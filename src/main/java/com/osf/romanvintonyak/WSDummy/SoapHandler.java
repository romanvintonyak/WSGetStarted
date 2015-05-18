package com.osf.romanvintonyak.WSDummy;

import java.io.ByteArrayOutputStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// if this is an incoming message from the client
		if (isRequest) {
			SOAPMessage soapMsg = context.getMessage();
			 try {
				context.put("xml", getXmlMessage(soapMsg));
				context.setScope("xml", MessageContext.Scope.APPLICATION);
			} catch (Exception e) {
				// TODO
				e.printStackTrace();
			}
 
		}
		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
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

	public String getXmlMessage(SOAPMessage message) throws Exception {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		message.writeTo(os);
		final String encoding = (String) message
				.getProperty(SOAPMessage.CHARACTER_SET_ENCODING);
		if (encoding == null) {
			return new String(os.toByteArray());
		} else {
			return new String(os.toByteArray(), encoding);
		}
	}

}
