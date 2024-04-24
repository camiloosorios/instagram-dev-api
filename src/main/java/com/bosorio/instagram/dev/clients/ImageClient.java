package com.bosorio.instagram.dev.clients;

import com.bosorio.instagram.dev.wsdl.image.GetImage;
import com.bosorio.instagram.dev.wsdl.image.GetImageResponse;
import com.bosorio.instagram.dev.wsdl.image.UploadImage;
import com.bosorio.instagram.dev.wsdl.image.UploadImageResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ImageClient extends WebServiceGatewaySupport {

    @Value("${soap.service.endpoint.image}")
    private String imageServiceEndpoint;

    public UploadImageResponse getUploadImageResponse(String imageData, String imageName, String token) {
        UploadImage uploadImage = new UploadImage();
        uploadImage.setArg0(imageData);
        uploadImage.setArg1(imageName);
        uploadImage.setArg2(token);

        JAXBElement<UploadImageResponse> response = (JAXBElement<UploadImageResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(imageServiceEndpoint, uploadImage);

        return response.getValue();
    }

    public GetImageResponse getImageResponse(String imageName, String token) {
        GetImage getImageRequest = new GetImage();
        getImageRequest.setArg0(imageName);
        getImageRequest.setArg1(token);

        JAXBElement<GetImageResponse> response = (JAXBElement<GetImageResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(imageServiceEndpoint, getImageRequest);

        return response.getValue();
    }

}
