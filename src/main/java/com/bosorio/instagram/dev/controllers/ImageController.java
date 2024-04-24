package com.bosorio.instagram.dev.controllers;

import com.bosorio.instagram.dev.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam MultipartFile imageData,
                                         @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            String imageDataString = Base64.getEncoder().encodeToString(imageData.getBytes());
            String fileName = imageData.getOriginalFilename();
            Map<String, String> response = new HashMap<>();
            response.put("message", imageService.uploadImage(imageDataString, fileName, token));

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (RuntimeException | IOException e) {
            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyReponse);
        }
    }

    @GetMapping
    public ResponseEntity<?> getImage(@RequestParam String fileName,
                                      @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            byte[] imageData = imageService.getImage(fileName, token);
            String base64Image = Base64.getEncoder().encodeToString(imageData);
            Map<String, String> response = new HashMap<>();
            response.put("imageData", base64Image);

            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (RuntimeException e) {
            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyReponse);
        }
    }

}
