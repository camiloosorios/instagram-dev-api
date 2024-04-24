
package com.bosorio.instagram.dev.wsdl.image;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ImageService", targetNamespace = "http://services.dev.instagram.bosorio.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImageService {


    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImage", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.image.GetImage")
    @ResponseWrapper(localName = "getImageResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.image.GetImageResponse")
    public byte[] getImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadImage", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.image.UploadImage")
    @ResponseWrapper(localName = "uploadImageResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.image.UploadImageResponse")
    public String uploadImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
