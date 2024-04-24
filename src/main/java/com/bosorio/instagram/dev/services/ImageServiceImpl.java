package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.clients.ImageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageClient imageClient;

    @Override
    public String uploadImage(String imageData, String imageName, String token) {
        return imageClient.getUploadImageResponse(imageData, imageName, token).getReturn();
    }

    @Override
    public byte[] getImage(String imageName, String token) {
        return imageClient.getImageResponse(imageName, token).getReturn();
    }
}
