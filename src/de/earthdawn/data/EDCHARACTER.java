//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="APPEARANCE" type="{http://earthdawn.com/datatypes}APPEARANCE_type"/>
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/datatypes}ATTRIBUTE_type" maxOccurs="6" minOccurs="6"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSE_type" minOccurs="0"/>
 *         &lt;element name="PROTECTION" type="{http://earthdawn.com/datatypes}PROTECTION_type" minOccurs="0"/>
 *         &lt;element name="HEALTH" type="{http://earthdawn.com/datatypes}HEALTH_type" minOccurs="0"/>
 *         &lt;element name="MOVEMENT" type="{http://earthdawn.com/datatypes}MOVEMENT_type" minOccurs="0"/>
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}INITIATIVE_type" minOccurs="0"/>
 *         &lt;element name="CARRYING" type="{http://earthdawn.com/datatypes}CARRYING_type" minOccurs="0"/>
 *         &lt;element name="DISCIPLINE" type="{http://earthdawn.com/datatypes}DISCIPLINE_type" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="TALENTS" type="{http://earthdawn.com/character}TALENTS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPELLS" type="{http://earthdawn.com/character}SPELLS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SKILL" type="{http://earthdawn.com/datatypes}SKILL_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MAGICITEM" type="{http://earthdawn.com/datatypes}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PATTERNITEM" type="{http://earthdawn.com/datatypes}PATTERNITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BLOODCHARMITEM" type="{http://earthdawn.com/datatypes}BLOODCHARMITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="THREADITEM" type="{http://earthdawn.com/datatypes}THREADITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COINS" type="{http://earthdawn.com/datatypes}COINS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ITEM" type="{http://earthdawn.com/datatypes}ITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMA" type="{http://earthdawn.com/datatypes}KARMA_type"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RACEABILITES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PORTRAIT" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CALCULATEDLEGENDPOINTS" type="{http://earthdawn.com/character}CALCULATEDLEGENDPOINTS_type" minOccurs="0"/>
 *         &lt;element name="EXPERIENCE" type="{http://earthdawn.com/datatypes}EXPERIENCE_type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appearance",
    "attribute",
    "defense",
    "protection",
    "health",
    "movement",
    "initiative",
    "carrying",
    "discipline",
    "talents",
    "spells",
    "skill",
    "weapon",
    "magicitem",
    "patternitem",
    "bloodcharmitem",
    "threaditem",
    "coins",
    "item",
    "karma",
    "description",
    "raceabilites",
    "comment",
    "portrait",
    "calculatedlegendpoints",
    "experience"
})
@XmlRootElement(name = "EDCHARACTER", namespace = "http://earthdawn.com/character")
public class EDCHARACTER {

    @XmlElement(name = "APPEARANCE", namespace = "http://earthdawn.com/character", required = true)
    protected APPEARANCEType appearance;
    @XmlElement(name = "ATTRIBUTE", namespace = "http://earthdawn.com/character", required = true)
    protected List<ATTRIBUTEType> attribute;
    @XmlElement(name = "DEFENSE", namespace = "http://earthdawn.com/character")
    protected DEFENSEType defense;
    @XmlElement(name = "PROTECTION", namespace = "http://earthdawn.com/character")
    protected PROTECTIONType protection;
    @XmlElement(name = "HEALTH", namespace = "http://earthdawn.com/character")
    protected HEALTHType health;
    @XmlElement(name = "MOVEMENT", namespace = "http://earthdawn.com/character")
    protected MOVEMENTType movement;
    @XmlElement(name = "INITIATIVE", namespace = "http://earthdawn.com/character")
    protected INITIATIVEType initiative;
    @XmlElement(name = "CARRYING", namespace = "http://earthdawn.com/character")
    protected CARRYINGType carrying;
    @XmlElement(name = "DISCIPLINE", namespace = "http://earthdawn.com/character")
    protected List<DISCIPLINEType> discipline;
    @XmlElement(name = "TALENTS", namespace = "http://earthdawn.com/character")
    protected List<TALENTSType> talents;
    @XmlElement(name = "SPELLS", namespace = "http://earthdawn.com/character")
    protected List<SPELLSType> spells;
    @XmlElement(name = "SKILL", namespace = "http://earthdawn.com/character")
    protected List<SKILLType> skill;
    @XmlElement(name = "WEAPON", namespace = "http://earthdawn.com/character")
    protected List<WEAPONType> weapon;
    @XmlElement(name = "MAGICITEM", namespace = "http://earthdawn.com/character")
    protected List<MAGICITEMType> magicitem;
    @XmlElement(name = "PATTERNITEM", namespace = "http://earthdawn.com/character")
    protected List<PATTERNITEMType> patternitem;
    @XmlElement(name = "BLOODCHARMITEM", namespace = "http://earthdawn.com/character")
    protected List<BLOODCHARMITEMType> bloodcharmitem;
    @XmlElement(name = "THREADITEM", namespace = "http://earthdawn.com/character")
    protected List<THREADITEMType> threaditem;
    @XmlElement(name = "COINS", namespace = "http://earthdawn.com/character")
    protected List<COINSType> coins;
    @XmlElement(name = "ITEM", namespace = "http://earthdawn.com/character")
    protected List<ITEMType> item;
    @XmlElement(name = "KARMA", namespace = "http://earthdawn.com/character", required = true)
    protected KARMAType karma;
    @XmlElement(name = "DESCRIPTION", namespace = "http://earthdawn.com/character")
    protected String description;
    @XmlElement(name = "RACEABILITES", namespace = "http://earthdawn.com/character")
    protected String raceabilites;
    @XmlElement(name = "COMMENT", namespace = "http://earthdawn.com/character")
    protected String comment;
    @XmlElement(name = "PORTRAIT", namespace = "http://earthdawn.com/character")
    protected List<byte[]> portrait;
    @XmlElement(name = "CALCULATEDLEGENDPOINTS", namespace = "http://earthdawn.com/character")
    protected CALCULATEDLEGENDPOINTSType calculatedlegendpoints;
    @XmlElement(name = "EXPERIENCE", namespace = "http://earthdawn.com/character", required = true)
    protected EXPERIENCEType experience;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the appearance property.
     * 
     * @return
     *     possible object is
     *     {@link APPEARANCEType }
     *     
     */
    public APPEARANCEType getAPPEARANCE() {
        return appearance;
    }

    /**
     * Sets the value of the appearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPEARANCEType }
     *     
     */
    public void setAPPEARANCE(APPEARANCEType value) {
        this.appearance = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRIBUTEType }
     * 
     * 
     */
    public List<ATTRIBUTEType> getATTRIBUTE() {
        if (attribute == null) {
            attribute = new ArrayList<ATTRIBUTEType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the defense property.
     * 
     * @return
     *     possible object is
     *     {@link DEFENSEType }
     *     
     */
    public DEFENSEType getDEFENSE() {
        return defense;
    }

    /**
     * Sets the value of the defense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFENSEType }
     *     
     */
    public void setDEFENSE(DEFENSEType value) {
        this.defense = value;
    }

    /**
     * Gets the value of the protection property.
     * 
     * @return
     *     possible object is
     *     {@link PROTECTIONType }
     *     
     */
    public PROTECTIONType getPROTECTION() {
        return protection;
    }

    /**
     * Sets the value of the protection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROTECTIONType }
     *     
     */
    public void setPROTECTION(PROTECTIONType value) {
        this.protection = value;
    }

    /**
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link HEALTHType }
     *     
     */
    public HEALTHType getHEALTH() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEALTHType }
     *     
     */
    public void setHEALTH(HEALTHType value) {
        this.health = value;
    }

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link MOVEMENTType }
     *     
     */
    public MOVEMENTType getMOVEMENT() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOVEMENTType }
     *     
     */
    public void setMOVEMENT(MOVEMENTType value) {
        this.movement = value;
    }

    /**
     * Gets the value of the initiative property.
     * 
     * @return
     *     possible object is
     *     {@link INITIATIVEType }
     *     
     */
    public INITIATIVEType getINITIATIVE() {
        return initiative;
    }

    /**
     * Sets the value of the initiative property.
     * 
     * @param value
     *     allowed object is
     *     {@link INITIATIVEType }
     *     
     */
    public void setINITIATIVE(INITIATIVEType value) {
        this.initiative = value;
    }

    /**
     * Gets the value of the carrying property.
     * 
     * @return
     *     possible object is
     *     {@link CARRYINGType }
     *     
     */
    public CARRYINGType getCARRYING() {
        return carrying;
    }

    /**
     * Sets the value of the carrying property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARRYINGType }
     *     
     */
    public void setCARRYING(CARRYINGType value) {
        this.carrying = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discipline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISCIPLINEType }
     * 
     * 
     */
    public List<DISCIPLINEType> getDISCIPLINE() {
        if (discipline == null) {
            discipline = new ArrayList<DISCIPLINEType>();
        }
        return this.discipline;
    }

    /**
     * Gets the value of the talents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the talents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTALENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTSType }
     * 
     * 
     */
    public List<TALENTSType> getTALENTS() {
        if (talents == null) {
            talents = new ArrayList<TALENTSType>();
        }
        return this.talents;
    }

    /**
     * Gets the value of the spells property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPELLSType }
     * 
     * 
     */
    public List<SPELLSType> getSPELLS() {
        if (spells == null) {
            spells = new ArrayList<SPELLSType>();
        }
        return this.spells;
    }

    /**
     * Gets the value of the skill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SKILLType }
     * 
     * 
     */
    public List<SKILLType> getSKILL() {
        if (skill == null) {
            skill = new ArrayList<SKILLType>();
        }
        return this.skill;
    }

    /**
     * Gets the value of the weapon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWEAPON().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WEAPONType }
     * 
     * 
     */
    public List<WEAPONType> getWEAPON() {
        if (weapon == null) {
            weapon = new ArrayList<WEAPONType>();
        }
        return this.weapon;
    }

    /**
     * Gets the value of the magicitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magicitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAGICITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAGICITEMType }
     * 
     * 
     */
    public List<MAGICITEMType> getMAGICITEM() {
        if (magicitem == null) {
            magicitem = new ArrayList<MAGICITEMType>();
        }
        return this.magicitem;
    }

    /**
     * Gets the value of the patternitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATTERNITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATTERNITEMType }
     * 
     * 
     */
    public List<PATTERNITEMType> getPATTERNITEM() {
        if (patternitem == null) {
            patternitem = new ArrayList<PATTERNITEMType>();
        }
        return this.patternitem;
    }

    /**
     * Gets the value of the bloodcharmitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bloodcharmitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBLOODCHARMITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BLOODCHARMITEMType }
     * 
     * 
     */
    public List<BLOODCHARMITEMType> getBLOODCHARMITEM() {
        if (bloodcharmitem == null) {
            bloodcharmitem = new ArrayList<BLOODCHARMITEMType>();
        }
        return this.bloodcharmitem;
    }

    /**
     * Gets the value of the threaditem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threaditem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTHREADITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THREADITEMType }
     * 
     * 
     */
    public List<THREADITEMType> getTHREADITEM() {
        if (threaditem == null) {
            threaditem = new ArrayList<THREADITEMType>();
        }
        return this.threaditem;
    }

    /**
     * Gets the value of the coins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOINS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COINSType }
     * 
     * 
     */
    public List<COINSType> getCOINS() {
        if (coins == null) {
            coins = new ArrayList<COINSType>();
        }
        return this.coins;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITEMType }
     * 
     * 
     */
    public List<ITEMType> getITEM() {
        if (item == null) {
            item = new ArrayList<ITEMType>();
        }
        return this.item;
    }

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link KARMAType }
     *     
     */
    public KARMAType getKARMA() {
        return karma;
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link KARMAType }
     *     
     */
    public void setKARMA(KARMAType value) {
        this.karma = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the raceabilites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRACEABILITES() {
        return raceabilites;
    }

    /**
     * Sets the value of the raceabilites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRACEABILITES(String value) {
        this.raceabilites = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the portrait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPORTRAIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getPORTRAIT() {
        if (portrait == null) {
            portrait = new ArrayList<byte[]>();
        }
        return this.portrait;
    }

    /**
     * Gets the value of the calculatedlegendpoints property.
     * 
     * @return
     *     possible object is
     *     {@link CALCULATEDLEGENDPOINTSType }
     *     
     */
    public CALCULATEDLEGENDPOINTSType getCALCULATEDLEGENDPOINTS() {
        return calculatedlegendpoints;
    }

    /**
     * Sets the value of the calculatedlegendpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CALCULATEDLEGENDPOINTSType }
     *     
     */
    public void setCALCULATEDLEGENDPOINTS(CALCULATEDLEGENDPOINTSType value) {
        this.calculatedlegendpoints = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * @return
     *     possible object is
     *     {@link EXPERIENCEType }
     *     
     */
    public EXPERIENCEType getEXPERIENCE() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPERIENCEType }
     *     
     */
    public void setEXPERIENCE(EXPERIENCEType value) {
        this.experience = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
