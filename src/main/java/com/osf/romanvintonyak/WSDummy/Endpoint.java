package com.osf.romanvintonyak.WSDummy;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
/**
 * A simple Web Service which receive a xml on input
 * and reply with other xml
 * created for education goals
 * @author Roman Vintonyak
 * @version 1.1 Based on Map<AssessmentCatalogQueryType, AssessmentCatalogType> data mock
 */
@WebService
@HandlerChain(file="handler.xml")
public interface Endpoint {
	/**
	 * Returns a xml structure based on input param
	 * 
	 * @param  query input AssessmentCatalogQuery xml 
	 * @return the AssessmentCatalog output xml
	 * @exception (@throws javax.xml.bind.JAXBException) 
	 */
	@WebMethod 
	AssessmentCatalogType processXML() throws JAXBException;

}