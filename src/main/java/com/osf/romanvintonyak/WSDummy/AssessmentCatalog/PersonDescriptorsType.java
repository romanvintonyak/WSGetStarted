//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:58 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonDescriptorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonDescriptorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalIdentifiers" type="{http://ns.hr-xml.org/2007-04-15}LegalIdentifiersType" minOccurs="0"/>
 *         &lt;element name="DemographicDescriptors" type="{http://ns.hr-xml.org/2007-04-15}DemographicDescriptorsType" minOccurs="0"/>
 *         &lt;element name="BiologicalDescriptors" type="{http://ns.hr-xml.org/2007-04-15}BiologicalDescriptorsType" minOccurs="0"/>
 *         &lt;element name="SupportingMaterials" type="{http://ns.hr-xml.org/2007-04-15}StaffingSupportingMaterialsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherDescriptors" type="{http://ns.hr-xml.org/2007-04-15}OtherDescriptorsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2007-04-15}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDescriptorsType", propOrder = {
    "legalIdentifiers",
    "demographicDescriptors",
    "biologicalDescriptors",
    "supportingMaterials",
    "otherDescriptors",
    "userArea"
})
public class PersonDescriptorsType {

    @XmlElement(name = "LegalIdentifiers")
    protected LegalIdentifiersType legalIdentifiers;
    @XmlElement(name = "DemographicDescriptors")
    protected DemographicDescriptorsType demographicDescriptors;
    @XmlElement(name = "BiologicalDescriptors")
    protected BiologicalDescriptorsType biologicalDescriptors;
    @XmlElement(name = "SupportingMaterials")
    protected List<StaffingSupportingMaterialsType> supportingMaterials;
    @XmlElement(name = "OtherDescriptors")
    protected List<OtherDescriptorsType> otherDescriptors;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the legalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link LegalIdentifiersType }
     *     
     */
    public LegalIdentifiersType getLegalIdentifiers() {
        return legalIdentifiers;
    }

    /**
     * Sets the value of the legalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalIdentifiersType }
     *     
     */
    public void setLegalIdentifiers(LegalIdentifiersType value) {
        this.legalIdentifiers = value;
    }

    /**
     * Gets the value of the demographicDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicDescriptorsType }
     *     
     */
    public DemographicDescriptorsType getDemographicDescriptors() {
        return demographicDescriptors;
    }

    /**
     * Sets the value of the demographicDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicDescriptorsType }
     *     
     */
    public void setDemographicDescriptors(DemographicDescriptorsType value) {
        this.demographicDescriptors = value;
    }

    /**
     * Gets the value of the biologicalDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link BiologicalDescriptorsType }
     *     
     */
    public BiologicalDescriptorsType getBiologicalDescriptors() {
        return biologicalDescriptors;
    }

    /**
     * Sets the value of the biologicalDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiologicalDescriptorsType }
     *     
     */
    public void setBiologicalDescriptors(BiologicalDescriptorsType value) {
        this.biologicalDescriptors = value;
    }

    /**
     * Gets the value of the supportingMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffingSupportingMaterialsType }
     * 
     * 
     */
    public List<StaffingSupportingMaterialsType> getSupportingMaterials() {
        if (supportingMaterials == null) {
            supportingMaterials = new ArrayList<StaffingSupportingMaterialsType>();
        }
        return this.supportingMaterials;
    }

    /**
     * Gets the value of the otherDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherDescriptorsType }
     * 
     * 
     */
    public List<OtherDescriptorsType> getOtherDescriptors() {
        if (otherDescriptors == null) {
            otherDescriptors = new ArrayList<OtherDescriptorsType>();
        }
        return this.otherDescriptors;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
