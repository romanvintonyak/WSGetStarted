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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssessmentApplicabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentApplicabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompetencyAssessed" type="{http://ns.hr-xml.org/2007-04-15}AssessmentCompetencyReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicableRegion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmentTarget" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmentJobCategory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessmentJobLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentApplicabilityType", propOrder = {
    "competencyAssessed",
    "assessmentLanguage",
    "applicableRegion",
    "assessmentTarget",
    "assessmentJobCategory",
    "assessmentJobLevel"
})
public class AssessmentApplicabilityType {

    @XmlElement(name = "CompetencyAssessed")
    protected List<AssessmentCompetencyReferenceType> competencyAssessed;
    @XmlElement(name = "AssessmentLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> assessmentLanguage;
    @XmlElement(name = "ApplicableRegion")
    protected List<String> applicableRegion;
    @XmlElement(name = "AssessmentTarget")
    protected List<String> assessmentTarget;
    @XmlElement(name = "AssessmentJobCategory")
    protected List<String> assessmentJobCategory;
    @XmlElement(name = "AssessmentJobLevel")
    protected List<String> assessmentJobLevel;

    /**
     * Gets the value of the competencyAssessed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyAssessed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyAssessed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentCompetencyReferenceType }
     * 
     * 
     */
    public List<AssessmentCompetencyReferenceType> getCompetencyAssessed() {
        if (competencyAssessed == null) {
            competencyAssessed = new ArrayList<AssessmentCompetencyReferenceType>();
        }
        return this.competencyAssessed;
    }

    /**
     * Gets the value of the assessmentLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentLanguage() {
        if (assessmentLanguage == null) {
            assessmentLanguage = new ArrayList<String>();
        }
        return this.assessmentLanguage;
    }

    /**
     * Gets the value of the applicableRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableRegion() {
        if (applicableRegion == null) {
            applicableRegion = new ArrayList<String>();
        }
        return this.applicableRegion;
    }

    /**
     * Gets the value of the assessmentTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentTarget() {
        if (assessmentTarget == null) {
            assessmentTarget = new ArrayList<String>();
        }
        return this.assessmentTarget;
    }

    /**
     * Gets the value of the assessmentJobCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentJobCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentJobCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentJobCategory() {
        if (assessmentJobCategory == null) {
            assessmentJobCategory = new ArrayList<String>();
        }
        return this.assessmentJobCategory;
    }

    /**
     * Gets the value of the assessmentJobLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentJobLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentJobLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentJobLevel() {
        if (assessmentJobLevel == null) {
            assessmentJobLevel = new ArrayList<String>();
        }
        return this.assessmentJobLevel;
    }

}
