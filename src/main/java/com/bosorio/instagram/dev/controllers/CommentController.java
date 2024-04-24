package com.bosorio.instagram.dev.controllers;

import com.bosorio.instagram.dev.services.CommentService;
import com.bosorio.instagram.dev.wsdl.comment.Comment;
import com.bosorio.instagram.dev.wsdl.comment.FindPost;
import com.bosorio.instagram.dev.wsdl.comment.PostComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/post/{postId}")
    public List<PostComment> findPostComments(@PathVariable Long postId) {
        return commentService.findPostComments(postId);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Comment comment,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            commentService.create(comment, token);

            Map<String, String> response = new HashMap<>();
            response.put("message", "Comment created successfully");

            return  ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (RuntimeException e) {
            Map<String, String> response = new HashMap<>();
            response.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    @GetMapping(value = "/{id}")
    public Comment findById(@PathVariable("id") Long id) {
        return commentService.findById(id);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Comment comment,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            commentService.update(comment, token);

            Map<String, String> response = new HashMap<>();
            response.put("message", "Comment updated successfully");

            return  ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (RuntimeException e) {
            Map<String, String> response = new HashMap<>();
            response.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            commentService.delete(id, token);

            Map<String, String> response = new HashMap<>();
            response.put("message", "Comment deleted successfully");

            return  ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (RuntimeException e) {
            Map<String, String> response = new HashMap<>();
            response.put("message", e.getMessage());
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

}
