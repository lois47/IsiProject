//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.23 at 01:38:17 PM CET 
//


package jaxb_classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tolerance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tolerancetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctanswerformat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctanswerlength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedback" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="fraction" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answerType", propOrder = {
    "text",
    "tolerance",
    "tolerancetype",
    "correctanswerformat",
    "correctanswerlength",
    "feedback"
})
public class AnswerType {

    protected String text;
    protected String tolerance;
    protected String tolerancetype;
    protected String correctanswerformat;
    protected String correctanswerlength;
    protected AnswerType.Feedback feedback;
    @XmlAttribute
    protected Float fraction;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(String value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the tolerancetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerancetype() {
        return tolerancetype;
    }

    /**
     * Sets the value of the tolerancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerancetype(String value) {
        this.tolerancetype = value;
    }

    /**
     * Gets the value of the correctanswerformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectanswerformat() {
        return correctanswerformat;
    }

    /**
     * Sets the value of the correctanswerformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectanswerformat(String value) {
        this.correctanswerformat = value;
    }

    /**
     * Gets the value of the correctanswerlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectanswerlength() {
        return correctanswerlength;
    }

    /**
     * Sets the value of the correctanswerlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectanswerlength(String value) {
        this.correctanswerlength = value;
    }

    /**
     * Gets the value of the feedback property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerType.Feedback }
     *     
     */
    public AnswerType.Feedback getFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerType.Feedback }
     *     
     */
    public void setFeedback(AnswerType.Feedback value) {
        this.feedback = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFraction(Float value) {
        this.fraction = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Feedback {

        @XmlElement(required = true)
        protected String text;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}