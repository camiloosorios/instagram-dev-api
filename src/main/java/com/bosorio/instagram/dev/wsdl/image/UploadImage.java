
package com.bosorio.instagram.dev.wsdl.image;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para uploadImage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="uploadImage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadImage", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
@XmlRootElement
public class UploadImage {

    protected String arg0;
    protected String arg1;
    protected String arg2;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * Define el valor de la propiedad arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

}
