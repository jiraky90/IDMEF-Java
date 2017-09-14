/**
 * IDMEF Package for JAVA
 *
 * @author Mattia Zago - dev [at] zagomattia [dot] it
 * @version 0.0.1
 * @since 14/09/2017
 * 
 * License Notice
 * 
 *   This file is subject to the terms and conditions defined in
 *   file 'LICENSE.txt', which is part of this source code package.
 * 
 * Copyright Notice
 *
 *   Edits and bug-fixes:
 *     Copyright (c) 2017 Mattia Zago. All rights reserved.
 *
 *   Auto-generated files:
 *     This file was generated by the JavaTM Architecture for XML Binding(JAXB)
 *     Reference Implementation, v2.2.8-b130911.1802 
 *     See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
 *
 *   IDMEF Schema:
 *     Copyright (c) 2008 IETF Trust and the persons identified as the
 *     IDMEF document authors.  All rights reserved.
 *     See https://tools.ietf.org/html/bcp78 for the complete license 
 *     document.
 */

package org.iana.idmef;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Target">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://iana.org/idmef}Node" minOccurs="0"/>
 *         &lt;element name="User" type="{http://iana.org/idmef}User" minOccurs="0"/>
 *         &lt;element name="Process" type="{http://iana.org/idmef}Process" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://iana.org/idmef}Service" minOccurs="0"/>
 *         &lt;element name="File" type="{http://iana.org/idmef}File" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="decoy" type="{http://iana.org/idmef}yes-no-type" default="unknown" />
 *       &lt;attribute name="interface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Target", propOrder = {
    "node",
    "user",
    "process",
    "service",
    "file"
})
public class Target implements Serializable {

    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = 861472755772419834L;
    @XmlElement(name = "Node")
    protected Node node;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "Process")
    protected Process process;
    @XmlElement(name = "Service")
    protected Service service;
    @XmlElement(name = "File")
    protected List<File> file;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "decoy")
    protected YesNoType decoy;
    @XmlAttribute(name = "interface")
    protected String _interface;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNode(Node value) {
        this.node = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link Process }
     *     
     */
    public Process getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link Process }
     *     
     */
    public void setProcess(Process value) {
        this.process = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link File }
     * 
     * 
     */
    public List<File> getFile() {
        if (file == null) {
            file = new ArrayList<File>();
        }
        return this.file;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        if (ident == null) {
            return "0";
        } else {
            return ident;
        }
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the decoy property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDecoy() {
        if (decoy == null) {
            return YesNoType.UNKNOWN;
        } else {
            return decoy;
        }
    }

    /**
     * Sets the value of the decoy property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDecoy(YesNoType value) {
        this.decoy = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}
