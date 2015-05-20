package com.osf.romanvintonyak.WSDummy;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
 
/**
 * A simple Web Service which receive a xml on input
 * and reply with other xml
 * created for education goals
 * @author Roman Vintonyak
 * @version 1.1 Based on Map<AssessmentCatalogQueryType, AssessmentCatalogType> data mock
 */
@WebService

public interface Endpoint {
	/**
	 * Returns a xml structure based on input param
	 * 
	 * @param  query input AssessmentCatalogQuery xml 
	 * @return the AssessmentCatalog output xml
	 * @exception (@throws javax.xml.bind.JAXBException) 
	 */
	@WebMethod
	@WebResult(name="AssessmentCatalog", targetNamespace="http://ns.hr-xml.org/2007-04-15")
	AssessmentCatalogType processXML(@WebParam(name = "AssessmentCatalogQuery", targetNamespace = "http://ns.hr-xml.org/2007-04-15") AssessmentCatalogQueryType query);

}