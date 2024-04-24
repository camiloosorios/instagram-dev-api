package com.bosorio.instagram.dev.services;

public interface ImageService {

    String uploadImage(String imageData, String imageName, String token);

    byte[] getImage(String imageName, String token);
}
