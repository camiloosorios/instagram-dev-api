package com.bosorio.instagram.dev.clients;

import com.bosorio.instagram.dev.wsdl.user.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class UserClient extends WebServiceGatewaySupport {

    @Value("${soap.service.endpoint.user}")
    private String userServiceEndpoint;

    public LoginResponse getLoginResponse(String email, String password) {
        Login loginRequest = new Login();
        loginRequest.setArg0(email);
        loginRequest.setArg1(password);

        JAXBElement<LoginResponse> response = (JAXBElement<LoginResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, loginRequest);

        return response.getValue();
    }

    public VerifyTokenResponse getVerifyTokenResponse(String token) {
        VerifyToken verifyTokenRequest = new VerifyToken();
        verifyTokenRequest.setArg0(token);

        JAXBElement<VerifyTokenResponse> response = (JAXBElement<VerifyTokenResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, verifyTokenRequest);

        return response.getValue();
    }

    public CreateResponse getCreateResponse(User user) {
        Create createRequest = new Create();
        createRequest.setArg0(user);

        JAXBElement<CreateResponse> response = (JAXBElement<CreateResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, createRequest);

        return response.getValue();

    }

    public FindAllResponse getFindAllResponse() {
        FindAll findAllRequest = new FindAll();

        JAXBElement<FindAllResponse> response = (JAXBElement<FindAllResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findAllRequest);

        return response.getValue();
    }

    public FindByIdResponse getFindByIdResponse(Long id) {
        FindById findByIdRequest = new FindById();
        findByIdRequest.setArg0(id);

        JAXBElement<FindByIdResponse> response = (JAXBElement<FindByIdResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findByIdRequest);

        return response.getValue();
    }

    public FindByUsernameOrFullNameResponse getFindByUsernameOrFullNameResponse(String param) {
        FindByUsernameOrFullName findByUsernameOrFullNameRequest = new FindByUsernameOrFullName();
        findByUsernameOrFullNameRequest.setArg0(param);

        JAXBElement<FindByUsernameOrFullNameResponse> response = (JAXBElement<FindByUsernameOrFullNameResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findByUsernameOrFullNameRequest);

        return response.getValue();
    }

    public FindByUsernameResponse getFindByUsernameResponse(String username) {
        FindByUsername findByUsernameRequest = new FindByUsername();
        findByUsernameRequest.setArg0(username);

        JAXBElement<FindByUsernameResponse> response = (JAXBElement<FindByUsernameResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findByUsernameRequest);

        return response.getValue();
    }

    public FindByEmailResponse getFindByEmailResponse(String email) {
        FindByEmail findByEmailRequest = new FindByEmail();
        findByEmailRequest.setArg0(email);

        JAXBElement<FindByEmailResponse> response = (JAXBElement<FindByEmailResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findByEmailRequest);

        return response.getValue();
    }

    public FollowResponse getFollowResponse(Long follower_id, Long followed_id, String token) {
        Follow followRequest = new Follow();
        followRequest.setArg0(follower_id);
        followRequest.setArg1(followed_id);
        followRequest.setArg2(token);

        JAXBElement<FollowResponse> response = (JAXBElement<FollowResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, followRequest);

        return response.getValue();
    }

    public UnfollowResponse getUnfollowResponse(Long follower_id, Long followed_id, String token) {
        Unfollow unfollowRequest = new Unfollow();
        unfollowRequest.setArg0(follower_id);
        unfollowRequest.setArg1(followed_id);
        unfollowRequest.setArg2(token);

        JAXBElement<UnfollowResponse> response = (JAXBElement<UnfollowResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, unfollowRequest);

        return response.getValue();
    }

    public FindFollowersResponse getFindFollowersResponse(Long userId) {
        FindFollowers findFollowersRequest = new FindFollowers();
        findFollowersRequest.setArg0(userId);

        JAXBElement<FindFollowersResponse> response = (JAXBElement<FindFollowersResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findFollowersRequest);

        return response.getValue();
    }

    public FindFollowingResponse getFindFollowingResponse(Long userId) {
        FindFollowing findFollowingRequest = new FindFollowing();
        findFollowingRequest.setArg0(userId);

        JAXBElement<FindFollowingResponse> response = (JAXBElement<FindFollowingResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findFollowingRequest);

        return response.getValue();
    }

    public UpdateResponse getUpdateResponse(User user, String token) {
        Update updateRequest = new Update();
        updateRequest.setArg0(user);
        updateRequest.setArg1(token);

        JAXBElement<UpdateResponse> response = (JAXBElement<UpdateResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, updateRequest);

        return response.getValue();
    }

    public DeleteResponse getDeleteResponse(Long id, String token) {
        Delete deleteRequest = new Delete();
        deleteRequest.setArg0(id);
        deleteRequest.setArg1(token);

        JAXBElement<DeleteResponse> response = (JAXBElement<DeleteResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, deleteRequest);

        return response.getValue();
    }


}
