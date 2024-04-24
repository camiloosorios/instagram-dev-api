
package com.bosorio.instagram.dev.wsdl.user;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bosorio.instagram.dev.wsdl.user package. 
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
    private static final QName _FindAll_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findAll");
    private static final QName _FindAllResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findAllResponse");
    private static final QName _FindByEmail_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByEmail");
    private static final QName _FindByEmailResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByEmailResponse");
    private static final QName _FindById_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findById");
    private static final QName _FindByIdResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByIdResponse");
    private static final QName _FindByUsername_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByUsername");
    private static final QName _FindByUsernameOrFullName_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByUsernameOrFullName");
    private static final QName _FindByUsernameOrFullNameResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByUsernameOrFullNameResponse");
    private static final QName _FindByUsernameResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findByUsernameResponse");
    private static final QName _FindFollowers_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowers");
    private static final QName _FindFollowersResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowersResponse");
    private static final QName _FindFollowing_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowing");
    private static final QName _FindFollowingResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "findFollowingResponse");
    private static final QName _Follow_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "follow");
    private static final QName _FollowResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "followResponse");
    private static final QName _Login_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "login");
    private static final QName _LoginResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "loginResponse");
    private static final QName _Unfollow_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "unfollow");
    private static final QName _UnfollowResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "unfollowResponse");
    private static final QName _Update_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "update");
    private static final QName _UpdateResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "updateResponse");
    private static final QName _User_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "user");
    private static final QName _VerifyToken_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "verifyToken");
    private static final QName _VerifyTokenResponse_QNAME = new QName("http://services.dev.instagram.bosorio.org/", "verifyTokenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bosorio.instagram.dev.wsdl.user
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
     * Create an instance of {@link FindAll }
     * 
     * @return
     *     the new instance of {@link FindAll }
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     * @return
     *     the new instance of {@link FindAllResponse }
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindByEmail }
     * 
     * @return
     *     the new instance of {@link FindByEmail }
     */
    public FindByEmail createFindByEmail() {
        return new FindByEmail();
    }

    /**
     * Create an instance of {@link FindByEmailResponse }
     * 
     * @return
     *     the new instance of {@link FindByEmailResponse }
     */
    public FindByEmailResponse createFindByEmailResponse() {
        return new FindByEmailResponse();
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
     * Create an instance of {@link FindByUsername }
     * 
     * @return
     *     the new instance of {@link FindByUsername }
     */
    public FindByUsername createFindByUsername() {
        return new FindByUsername();
    }

    /**
     * Create an instance of {@link FindByUsernameOrFullName }
     * 
     * @return
     *     the new instance of {@link FindByUsernameOrFullName }
     */
    public FindByUsernameOrFullName createFindByUsernameOrFullName() {
        return new FindByUsernameOrFullName();
    }

    /**
     * Create an instance of {@link FindByUsernameOrFullNameResponse }
     * 
     * @return
     *     the new instance of {@link FindByUsernameOrFullNameResponse }
     */
    public FindByUsernameOrFullNameResponse createFindByUsernameOrFullNameResponse() {
        return new FindByUsernameOrFullNameResponse();
    }

    /**
     * Create an instance of {@link FindByUsernameResponse }
     * 
     * @return
     *     the new instance of {@link FindByUsernameResponse }
     */
    public FindByUsernameResponse createFindByUsernameResponse() {
        return new FindByUsernameResponse();
    }

    /**
     * Create an instance of {@link FindFollowers }
     * 
     * @return
     *     the new instance of {@link FindFollowers }
     */
    public FindFollowers createFindFollowers() {
        return new FindFollowers();
    }

    /**
     * Create an instance of {@link FindFollowersResponse }
     * 
     * @return
     *     the new instance of {@link FindFollowersResponse }
     */
    public FindFollowersResponse createFindFollowersResponse() {
        return new FindFollowersResponse();
    }

    /**
     * Create an instance of {@link FindFollowing }
     * 
     * @return
     *     the new instance of {@link FindFollowing }
     */
    public FindFollowing createFindFollowing() {
        return new FindFollowing();
    }

    /**
     * Create an instance of {@link FindFollowingResponse }
     * 
     * @return
     *     the new instance of {@link FindFollowingResponse }
     */
    public FindFollowingResponse createFindFollowingResponse() {
        return new FindFollowingResponse();
    }

    /**
     * Create an instance of {@link Follow }
     * 
     * @return
     *     the new instance of {@link Follow }
     */
    public Follow createFollow() {
        return new Follow();
    }

    /**
     * Create an instance of {@link FollowResponse }
     * 
     * @return
     *     the new instance of {@link FollowResponse }
     */
    public FollowResponse createFollowResponse() {
        return new FollowResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     * @return
     *     the new instance of {@link Login }
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return
     *     the new instance of {@link LoginResponse }
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Unfollow }
     * 
     * @return
     *     the new instance of {@link Unfollow }
     */
    public Unfollow createUnfollow() {
        return new Unfollow();
    }

    /**
     * Create an instance of {@link UnfollowResponse }
     * 
     * @return
     *     the new instance of {@link UnfollowResponse }
     */
    public UnfollowResponse createUnfollowResponse() {
        return new UnfollowResponse();
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
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link VerifyToken }
     * 
     * @return
     *     the new instance of {@link VerifyToken }
     */
    public VerifyToken createVerifyToken() {
        return new VerifyToken();
    }

    /**
     * Create an instance of {@link VerifyTokenResponse }
     * 
     * @return
     *     the new instance of {@link VerifyTokenResponse }
     */
    public VerifyTokenResponse createVerifyTokenResponse() {
        return new VerifyTokenResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByEmail")
    public JAXBElement<FindByEmail> createFindByEmail(FindByEmail value) {
        return new JAXBElement<>(_FindByEmail_QNAME, FindByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByEmailResponse")
    public JAXBElement<FindByEmailResponse> createFindByEmailResponse(FindByEmailResponse value) {
        return new JAXBElement<>(_FindByEmailResponse_QNAME, FindByEmailResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByUsername")
    public JAXBElement<FindByUsername> createFindByUsername(FindByUsername value) {
        return new JAXBElement<>(_FindByUsername_QNAME, FindByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsernameOrFullName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsernameOrFullName }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByUsernameOrFullName")
    public JAXBElement<FindByUsernameOrFullName> createFindByUsernameOrFullName(FindByUsernameOrFullName value) {
        return new JAXBElement<>(_FindByUsernameOrFullName_QNAME, FindByUsernameOrFullName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsernameOrFullNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsernameOrFullNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByUsernameOrFullNameResponse")
    public JAXBElement<FindByUsernameOrFullNameResponse> createFindByUsernameOrFullNameResponse(FindByUsernameOrFullNameResponse value) {
        return new JAXBElement<>(_FindByUsernameOrFullNameResponse_QNAME, FindByUsernameOrFullNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findByUsernameResponse")
    public JAXBElement<FindByUsernameResponse> createFindByUsernameResponse(FindByUsernameResponse value) {
        return new JAXBElement<>(_FindByUsernameResponse_QNAME, FindByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowers }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowers")
    public JAXBElement<FindFollowers> createFindFollowers(FindFollowers value) {
        return new JAXBElement<>(_FindFollowers_QNAME, FindFollowers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowersResponse")
    public JAXBElement<FindFollowersResponse> createFindFollowersResponse(FindFollowersResponse value) {
        return new JAXBElement<>(_FindFollowersResponse_QNAME, FindFollowersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowing }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowing }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowing")
    public JAXBElement<FindFollowing> createFindFollowing(FindFollowing value) {
        return new JAXBElement<>(_FindFollowing_QNAME, FindFollowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFollowingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindFollowingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "findFollowingResponse")
    public JAXBElement<FindFollowingResponse> createFindFollowingResponse(FindFollowingResponse value) {
        return new JAXBElement<>(_FindFollowingResponse_QNAME, FindFollowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Follow }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Follow }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "follow")
    public JAXBElement<Follow> createFollow(Follow value) {
        return new JAXBElement<>(_Follow_QNAME, Follow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FollowResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "followResponse")
    public JAXBElement<FollowResponse> createFollowResponse(FollowResponse value) {
        return new JAXBElement<>(_FollowResponse_QNAME, FollowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unfollow }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Unfollow }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "unfollow")
    public JAXBElement<Unfollow> createUnfollow(Unfollow value) {
        return new JAXBElement<>(_Unfollow_QNAME, Unfollow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnfollowResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnfollowResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "unfollowResponse")
    public JAXBElement<UnfollowResponse> createUnfollowResponse(UnfollowResponse value) {
        return new JAXBElement<>(_UnfollowResponse_QNAME, UnfollowResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyToken }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyToken }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "verifyToken")
    public JAXBElement<VerifyToken> createVerifyToken(VerifyToken value) {
        return new JAXBElement<>(_VerifyToken_QNAME, VerifyToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTokenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyTokenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dev.instagram.bosorio.org/", name = "verifyTokenResponse")
    public JAXBElement<VerifyTokenResponse> createVerifyTokenResponse(VerifyTokenResponse value) {
        return new JAXBElement<>(_VerifyTokenResponse_QNAME, VerifyTokenResponse.class, null, value);
    }

}
