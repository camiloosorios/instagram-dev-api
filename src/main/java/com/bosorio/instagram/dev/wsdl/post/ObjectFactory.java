
package com.bosorio.instagram.dev.wsdl.post;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bosorio.instagram.dev.wsdl.post package. 
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

    private static final QName _Create_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "create");
    private static final QName _CreateResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "createResponse");
    private static final QName _Delete_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "delete");
    private static final QName _DeleteResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "deleteResponse");
    private static final QName _FindById_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findById");
    private static final QName _FindByIdResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByIdResponse");
    private static final QName _FindFollowingPosts_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowingPosts");
    private static final QName _FindFollowingPostsResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowingPostsResponse");
    private static final QName _FindUserPosts_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findUserPosts");
    private static final QName _FindUserPostsResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findUserPostsResponse");
    private static final QName _Post_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "post");
    private static final QName _Update_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "update");
    private static final QName _UpdateResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bosorio.instagram.dev.wsdl.post
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link FindFollowingPosts }
     * 
     * @return
     *     the new instance of {@link FindFollowingPosts }
     */
    public FindFollowingPosts createFindFollowingPosts() {
        return new FindFollowingPosts();
    }

    /**
     * Create an instance of {@link FindFollowingPostsResponse }
     * 
     * @return
     *     the new instance of {@link FindFollowingPostsResponse }
     */
    public FindFollowingPostsResponse createFindFollowingPostsResponse() {
        return new FindFollowingPostsResponse();
    }

    /**
     * Create an instance of {@link FindUserPosts }
     * 
     * @return
     *     the new instance of {@link FindUserPosts }
     */
    public FindUserPosts createFindUserPosts() {
        return new FindUserPosts();
    }

    /**
     * Create an instance of {@link FindUserPostsResponse }
     * 
     * @return
     *     the new instance of {@link FindUserPostsResponse }
     */
    public FindUserPostsResponse createFindUserPostsResponse() {
        return new FindUserPostsResponse();
    }

    /**
     * Create an instance of {@link Post }
     * 
     * @return
     *     the new instance of {@link Post }
     */
    public Post createPost() {
        return new Post();
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
     * Create an instance of {@link PostUser }
     * 
     * @return
     *     the new instance of {@link PostUser }
     */
    public PostUser createPostUser() {
        return new PostUser();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowingPosts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowingPosts }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowingPosts")
    public JAXBElement<FindFollowingPosts> createFindFollowingPosts(FindFollowingPosts value) {
        return new JAXBElement<>(_FindFollowingPosts_QNAME, FindFollowingPosts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowingPostsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowingPostsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowingPostsResponse")
    public JAXBElement<FindFollowingPostsResponse> createFindFollowingPostsResponse(FindFollowingPostsResponse value) {
        return new JAXBElement<>(_FindFollowingPostsResponse_QNAME, FindFollowingPostsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserPosts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUserPosts }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findUserPosts")
    public JAXBElement<FindUserPosts> createFindUserPosts(FindUserPosts value) {
        return new JAXBElement<>(_FindUserPosts_QNAME, FindUserPosts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserPostsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUserPostsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findUserPostsResponse")
    public JAXBElement<FindUserPostsResponse> createFindUserPostsResponse(FindUserPostsResponse value) {
        return new JAXBElement<>(_FindUserPostsResponse_QNAME, FindUserPostsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Post }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Post }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "post")
    public JAXBElement<Post> createPost(Post value) {
        return new JAXBElement<>(_Post_QNAME, Post.class, null, value);
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
