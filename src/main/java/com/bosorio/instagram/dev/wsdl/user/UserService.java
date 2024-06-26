
package com.bosorio.instagram.dev.wsdl.user;

import java.util.List;
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
@WebService(name = "UserService", targetNamespace = "http://services.dev.instagram.bosorio.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.LoginResponse")
    public String login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     */
    @WebMethod
    @RequestWrapper(localName = "follow", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Follow")
    @ResponseWrapper(localName = "followResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FollowResponse")
    public void follow(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.bosorio.instagram.dev.wsdl.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByUsernameOrFullName", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByUsernameOrFullName")
    @ResponseWrapper(localName = "findByUsernameOrFullNameResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByUsernameOrFullNameResponse")
    public List<User> findByUsernameOrFullName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.DeleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.bosorio.instagram.dev.wsdl.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindAllResponse")
    public List<User> findAll();

    /**
     * 
     * @param arg0
     * @param arg1
     */
    @WebMethod
    @RequestWrapper(localName = "update", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.UpdateResponse")
    public void update(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.bosorio.instagram.dev.wsdl.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findFollowing", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindFollowing")
    @ResponseWrapper(localName = "findFollowingResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindFollowingResponse")
    public List<User> findFollowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyToken", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.VerifyToken")
    @ResponseWrapper(localName = "verifyTokenResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.VerifyTokenResponse")
    public boolean verifyToken(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.bosorio.instagram.dev.wsdl.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findFollowers", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindFollowers")
    @ResponseWrapper(localName = "findFollowersResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindFollowersResponse")
    public List<User> findFollowers(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     */
    @WebMethod
    @RequestWrapper(localName = "unfollow", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Unfollow")
    @ResponseWrapper(localName = "unfollowResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.UnfollowResponse")
    public void unfollow(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bosorio.instagram.dev.wsdl.user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByEmail", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByEmail")
    @ResponseWrapper(localName = "findByEmailResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByEmailResponse")
    public User findByEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.CreateResponse")
    public String create(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bosorio.instagram.dev.wsdl.user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByIdResponse")
    public User findById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bosorio.instagram.dev.wsdl.user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByUsername", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByUsername")
    @ResponseWrapper(localName = "findByUsernameResponse", targetNamespace = "http://services.dev.instagram.bosorio.org/", className = "com.bosorio.instagram.dev.wsdl.user.FindByUsernameResponse")
    public User findByUsername(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
