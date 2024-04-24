
package com.bosorio.instagram.dev.wsdl.image;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bosorio.instagram.dev.wsdl.image package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetImage_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "getImage");
    private static final QName _GetImageResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "getImageResponse");
    private static final QName _UploadImage_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "uploadImage");
    private static final QName _UploadImageResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "uploadImageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bosorio.instagram.dev.wsdl.image
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     * @return
     *     the new instance of {@link GetImage }
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     * @return
     *     the new instance of {@link GetImageResponse }
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     * @return
     *     the new instance of {@link UploadImage }
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     * @return
     *     the new instance of {@link UploadImageResponse }
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<>(_GetImage_QNAME, GetImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "uploadImage")
    public JAXBElement<UploadImage> createUploadImage(UploadImage value) {
        return new JAXBElement<>(_UploadImage_QNAME, UploadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "uploadImageResponse")
    public JAXBElement<UploadImageResponse> createUploadImageResponse(UploadImageResponse value) {
        return new JAXBElement<>(_UploadImageResponse_QNAME, UploadImageResponse.class, null, value);
    }

}
