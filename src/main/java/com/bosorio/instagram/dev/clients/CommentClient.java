package com.bosorio.instagram.dev.clients;

import com.bosorio.instagram.dev.wsdl.comment.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

public class CommentClient extends WebServiceGatewaySupport {

    @Value("${soap.service.endpoint.comment}")
    private String commentServiceEndpoint;

    public CreateResponse getCreateResponse(Comment comment, String token) {
        Create createRequest = new Create();
        createRequest.setArg0(comment);
        createRequest.setArg1(token);

        JAXBElement<CreateResponse> response = (JAXBElement<CreateResponse>) getWebServiceTemplate()
               .marshalSendAndReceive(commentServiceEndpoint, createRequest);

        return response.getValue();
    }

    public FindPostCommentsResponse getFindPostCommentsResponse(Long postId) {
        FindPostComments findAllRequest = new FindPostComments();
        findAllRequest.setArg0(postId);

        JAXBElement<FindPostCommentsResponse> response = (JAXBElement<FindPostCommentsResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(commentServiceEndpoint, findAllRequest);

        return response.getValue();
    }

    public FindByIdResponse getFindByIdResponse(Long id) {
        FindById findByIdRequest = new FindById();
        findByIdRequest.setArg0(id);

        JAXBElement<FindByIdResponse> response = (JAXBElement<FindByIdResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(commentServiceEndpoint, findByIdRequest);

        return response.getValue();
    }

    public UpdateResponse getUpdateResponse(Comment comment, String token) {
        Update updateRequest = new Update();
        updateRequest.setArg0(comment);

        JAXBElement<UpdateResponse> response = (JAXBElement<UpdateResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(commentServiceEndpoint, updateRequest);

        return response.getValue();
    }

    public DeleteResponse getDeleteResponse(Long id, String token) {
        Delete deleteRequest = new Delete();
        deleteRequest.setArg0(id);

        JAXBElement<DeleteResponse> response = (JAXBElement<DeleteResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(commentServiceEndpoint, deleteRequest);

        return response.getValue();
    }

}
