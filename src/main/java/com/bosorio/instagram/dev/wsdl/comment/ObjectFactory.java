
package com.bosorio.instagram.dev.wsdl.comment;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bosorio.instagram.dev.wsdl.comment package. 
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

    private static final QName _Comment_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "comment");
    private static final QName _Create_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "create");
    private static final QName _CreateResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "createResponse");
    private static final QName _Delete_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "delete");
    private static final QName _DeleteResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "deleteResponse");
    private static final QName _FindById_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findById");
    private static final QName _FindByIdResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByIdResponse");
    private static final QName _FindPostComments_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findPostComments");
    private static final QName _FindPostCommentsResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findPostCommentsResponse");
    private static final QName _Update_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "update");
    private static final QName _UpdateResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bosorio.instagram.dev.wsdl.comment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Comment }
     * 
     * @return
     *     the new instance of {@link Comment }
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Create }
     * 
     * @return
     *     the new instance of {@link Create }
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     * @return
     *     the new instance of {@link CreateResponse }
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     * @return
     *     the new instance of {@link Delete }
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     * @return
     *     the new instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     * @return
     *     the new instance of {@link FindById }
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     * @return
     *     the new instance of {@link FindByIdResponse }
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindPostComments }
     * 
     * @return
     *     the new instance of {@link FindPostComments }
     */
    public FindPostComments createFindPostComments() {
        return new FindPostComments();
    }

    /**
     * Create an instance of {@link FindPostCommentsResponse }
     * 
     * @return
     *     the new instance of {@link FindPostCommentsResponse }
     */
    public FindPostCommentsResponse createFindPostCommentsResponse() {
        return new FindPostCommentsResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     * @return
     *     the new instance of {@link Update }
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     * @return
     *     the new instance of {@link UpdateResponse }
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link PostComment }
     * 
     * @return
     *     the new instance of {@link PostComment }
     */
    public PostComment createPostComment() {
        return new PostComment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "comment")
    public JAXBElement<Comment> createComment(Comment value) {
        return new JAXBElement<>(_Comment_QNAME, Comment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPostComments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindPostComments }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findPostComments")
    public JAXBElement<FindPostComments> createFindPostComments(FindPostComments value) {
        return new JAXBElement<>(_FindPostComments_QNAME, FindPostComments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPostCommentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindPostCommentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findPostCommentsResponse")
    public JAXBElement<FindPostCommentsResponse> createFindPostCommentsResponse(FindPostCommentsResponse value) {
        return new JAXBElement<>(_FindPostCommentsResponse_QNAME, FindPostCommentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
