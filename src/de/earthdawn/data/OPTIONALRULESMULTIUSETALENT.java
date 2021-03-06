//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPTIONALRULES_MULTIUSETALENT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OPTIONALRULES_MULTIUSETALENT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="talent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="count" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" /&gt;
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTIONALRULES_MULTIUSETALENT", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULESMULTIUSETALENT {

    @XmlAttribute(name = "talent", required = true)
    protected String talent;
    @XmlAttribute(name = "count", required = true)
    protected int count;
    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;

    /**
     * Gets the value of the talent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTalent() {
        return talent;
    }

    /**
     * Sets the value of the talent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTalent(String value) {
        this.talent = value;
    }

    /**
     * Gets the value of the count property.
     *
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return
     *     possible object is
     *     {@link LanguageType }
     *
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *
     */
    public void setLang(LanguageType value) {
        this.lang = value;
    }

}
