package com.bosorio.instagram.dev.clients;

import com.bosorio.instagram.dev.wsdl.post.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

public class PostClient extends WebServiceGatewaySupport {

    @Value("${soap.service.endpoint.post}")
    private String userServiceEndpoint;

    public CreateResponse getCreateResponse(Post post, String token) {
        Create createRequest = new Create();
        createRequest.setArg0(post);
        createRequest.setArg1(token);

        JAXBElement<CreateResponse> response = (JAXBElement<CreateResponse>) getWebServiceTemplate()
               .marshalSendAndReceive(userServiceEndpoint, createRequest);

        return response.getValue();
    }

    public FindUserPostsResponse getFindUserPostsResponse(Long userId, String token) {
        FindUserPosts findUserPostRequest = new FindUserPosts();
        findUserPostRequest.setArg0(userId);
        findUserPostRequest.setArg1(token);

        JAXBElement<FindUserPostsResponse> response = (JAXBElement<FindUserPostsResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findUserPostRequest);

        return response.getValue();
    }

    public FindFollowingPostsResponse getFindFollowingPostsResponse(Long userId, String token) {
        FindFollowingPosts FindFollowingPostsRequest = new FindFollowingPosts();
        FindFollowingPostsRequest.setArg0(userId);
        FindFollowingPostsRequest.setArg1(token);


        JAXBElement<FindFollowingPostsResponse> response = (JAXBElement<FindFollowingPostsResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, FindFollowingPostsRequest);

        return response.getValue();
    }

    public FindByIdResponse getFindByIdResponse(Long id) {
        FindById findByIdRequest = new FindById();
        findByIdRequest.setArg0(id);

        JAXBElement<FindByIdResponse> response = (JAXBElement<FindByIdResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(userServiceEndpoint, findByIdRequest);

        return response.getValue();
    }

    public UpdateResponse getUpdateResponse(Post post, String token) {
        Update updateRequest = new Update();
        updateRequest.setArg0(post);
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
