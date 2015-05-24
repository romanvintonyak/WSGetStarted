package com.osf.romanvintonyak.WSDummy.test;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;

public class TestMarshallUnmarshall {
	
	private static String xml = "<AssessmentCatalogQuery xmlns=\"http://ns.hr-xml.org/2007-04-15\">" 
			+ "<ClientId>"
			+ "<IdValue>20148</IdValue>"
			+ "</ClientId>"
			+ "<ProviderId>"
			+ "<IdValue name=\"VendorId\">eSkill-19586</IdValue>"
			+ "</ProviderId>"
			+ "<UserArea/>"
			+ "</AssessmentCatalogQuery>";
	

	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(AssessmentCatalogQueryType.class);
		
		AssessmentCatalogQueryType query = unmarshal(xml,jc);
		System.out.println("==============================");
		marshal(query, jc);
		
		
	}

	private static AssessmentCatalogQueryType unmarshal(String xml, JAXBContext jc) throws JAXBException {
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Source reader = new StreamSource(new ByteArrayInputStream(xml.getBytes()));
		JAXBElement<AssessmentCatalogQueryType> element = unmarshaller.unmarshal(reader, AssessmentCatalogQueryType.class);
		AssessmentCatalogQueryType query = element.getValue();
		System.out.println(query);
		return query;
	}
	
	private static void marshal(AssessmentCatalogQueryType query, JAXBContext jc) throws JAXBException {
		
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(query, System.out);
	}

}
