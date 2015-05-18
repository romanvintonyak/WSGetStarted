package com.osf.romanvintonyak.WSDummy;

import java.util.HashMap;
import java.util.Map;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentPackageType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.EntityIdType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.EntityIdType.IdValue;
/**
 * AssessmentCatalog in-memory db mock 
 * @author Roman Vintonyak
 *
 */
public class CatalogDatasourceMock {
	
	private Map<AssessmentCatalogQueryType, AssessmentCatalogType> data = new HashMap<>(); 
	
	/**
	 * Init data
	 */
	public CatalogDatasourceMock(){
		
		AssessmentCatalogQueryType query1 = new AssessmentCatalogQueryType();
		AssessmentCatalogQueryType query2 = new AssessmentCatalogQueryType();
		AssessmentCatalogQueryType query3 = new AssessmentCatalogQueryType();
		
		query1.setClientId(new EntityIdType());
		query1.setProviderId(new EntityIdType());
		query2.setClientId(new EntityIdType());
		query2.setProviderId(new EntityIdType());
		query3.setClientId(new EntityIdType());
		query3.setProviderId(new EntityIdType());
		
		AssessmentCatalogType catalog1 = new AssessmentCatalogType();
		AssessmentCatalogType catalog2 = new AssessmentCatalogType();
		AssessmentCatalogType catalog3 = new AssessmentCatalogType();
		
		AssessmentPackageType package1 = new AssessmentPackageType();
		AssessmentPackageType package2 = new AssessmentPackageType();
		AssessmentPackageType package3 = new AssessmentPackageType();
		
		
		package1.setPackageId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		package2.setPackageId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		package3.setPackageId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		
		catalog1.setProviderId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		catalog2.setProviderId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		catalog3.setProviderId(new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType());
		
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue catalogIdValue1 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("eSkill-19586");
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue catalogIdValue2 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("eSkill-20586");
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue catalogIdValue3 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("eSkill-21586");
		
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue packageIdValue1 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("5d2358a77b72e52d");
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue packageIdValue2 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("6d2358a77b72e52d");
		com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue packageIdValue3 = new com.osf.romanvintonyak.WSDummy.AssessmentCatalog.EntityIdType.IdValue("7d2358a77b72e52d");
		
		//set up first pair
		query1.getClientId().getIdValue().add(new IdValue("20148"));
		query1.getProviderId().getIdValue().add(new IdValue("eSkill-19586"));
		catalog1.getProviderId().getIdValue().add(catalogIdValue1);
		package1.getPackageId().getIdValue().add(packageIdValue1);
		package1.setName("first demo test");
		catalog1.getAssessmentPackage().add(package1);
		
		//set up second pair
		query2.getClientId().getIdValue().add(new IdValue("21148"));
		query2.getProviderId().getIdValue().add(new IdValue("eSkill-20586"));
		catalog2.getProviderId().getIdValue().add(catalogIdValue2);
		package2.getPackageId().getIdValue().add(packageIdValue2);
		package2.setName("secomd demo test");
		catalog2.getAssessmentPackage().add(package2);
		
		//set up third pair
		query3.getClientId().getIdValue().add(new IdValue("22148"));
		query3.getProviderId().getIdValue().add(new IdValue("eSkill-21586"));
		catalog3.getProviderId().getIdValue().add(catalogIdValue3);
		package3.getPackageId().getIdValue().add(packageIdValue3);
		package3.setName("third demo test");
		catalog3.getAssessmentPackage().add(package3);
		
		data.put(query1, catalog1);
		data.put(query2, catalog2);
		data.put(query3, catalog3);
	}

	public Map<AssessmentCatalogQueryType, AssessmentCatalogType> getData() {
		return data;
	}

	
	

	
	
} 
