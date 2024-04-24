package com.bosorio.instagram.dev.controllers;

import com.bosorio.instagram.dev.services.PostService;
import com.bosorio.instagram.dev.wsdl.post.Post;
import com.bosorio.instagram.dev.wsdl.post.PostUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/user/{userId}")
    public List<Post> findUserPosts(@PathVariable Long userId,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        return postService.findUserPosts(userId, token);
    }

    @GetMapping(value = "/following/{userId}")
    public List<PostUser> findFollowingPosts(@PathVariable Long userId,
                                             @RequestHeader(value = "Authorization", required = false) String token) {
        return postService.findFollowingPosts(userId, token);
    }

    @GetMapping(value = "/{id}")
    public Post findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Post post,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            postService.create(post, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "Post created successfully");

            return ResponseEntity.status(HttpStatus.CREATED).body(bodyReponse);
        } catch (RuntimeException e) {
            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyReponse);
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Post post,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            postService.update(post, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "Post updated successfully");

            return ResponseEntity.status(HttpStatus.OK).body(bodyReponse);
        } catch (RuntimeException e) {
            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyReponse);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            postService.delete(id, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "Post deleted successfully");

            return ResponseEntity.status(HttpStatus.OK).body(bodyReponse);
        } catch (RuntimeException e) {
            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", e.getMessage());

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyReponse);
        }
    }

}
