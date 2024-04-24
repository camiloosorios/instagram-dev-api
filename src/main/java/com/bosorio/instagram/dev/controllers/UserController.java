package com.bosorio.instagram.dev.controllers;

import com.bosorio.instagram.dev.services.UserService;
import com.bosorio.instagram.dev.wsdl.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginRequest) {
        try {
            String email = loginRequest.get("email");
            String password = loginRequest.get("password");
            String token = userService.login(email, password);
            User user = userService.findByEmail(email);

            Map<String, Object> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "Welcome");
            bodyReponse.put("token", token);
            bodyReponse.put("user", user);

            return ResponseEntity.status(HttpStatus.OK).body(bodyReponse);
        } catch (RuntimeException  e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error logging in: " + errorMessage);
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @GetMapping(value = "/auth")
    public ResponseEntity<?> auth(@RequestHeader(value = "Authorization", required = false) String token) {
        try {
            Map<String, Boolean> bodyReponse = new HashMap<>();
            bodyReponse.put("message", userService.verifyToken(token));

            return ResponseEntity.status(HttpStatus.OK).body(bodyReponse);
        } catch (RuntimeException  e) {
            Map<String, Boolean> errorResponse = new HashMap<>();
            errorResponse.put("message", false);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user) {
        try {
            String token = userService.create(user);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "User created successfully");
            bodyReponse.put("token", token);

            return ResponseEntity.status(HttpStatus.CREATED).body(bodyReponse);
        } catch (RuntimeException  e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error creating user: " + errorMessage);
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/user/{param}")
    public List<User> findByUsernameOrFullName(@PathVariable("param") String param) {
        return userService.findByUsernameOrFullName(param);
    }

    @GetMapping(value = "/find/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

    @PostMapping(value = "/follow/{follower_id}/{followed_id}")
    public ResponseEntity<?> follow(@PathVariable("follower_id") Long followerId,
                                    @PathVariable("followed_id") Long followedId,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            if (token == null || token.isEmpty()) {
                throw new RuntimeException("Authentication is required");
            }
            userService.follow(followerId, followedId, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "User followed successfully");

            return ResponseEntity.ok().body(bodyReponse);
        } catch (Exception e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error following user: " + errorMessage);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @DeleteMapping(value = "/unfollow/{follower_id}/{followed_id}")
    public ResponseEntity<?> unfollow(@PathVariable("follower_id") Long followerId,
                                      @PathVariable("followed_id") Long followedId,
                                      @RequestHeader("Authorization") String token) {
        try {
            userService.unfollow(followerId, followedId, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "User unfollowed successfully");

            return ResponseEntity.ok().body(bodyReponse);
        } catch (RuntimeException e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error unfollowing user: " + errorMessage);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @GetMapping(value = "/followers/{userId}")
    public List<User> findFollowers(@PathVariable("userId") Long userId) {
        return userService.findFollowers(userId);
    }

    @GetMapping(value = "/following/{userId}")
    public List<User> findFollowing(@PathVariable("userId") Long userId) {
        return userService.findFollowing(userId);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody User user,
                                    @RequestHeader(value = "Authorization", required = false) String token) {
        try {
            userService.update(user, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "User updated successfully");

            return ResponseEntity.ok().body(bodyReponse);
        } catch (RuntimeException e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();

            errorResponse.put("message", "Error updating user: " + errorMessage);
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id,
                                    @RequestHeader("Authorization") String token) {
        try {
            userService.delete(id, token);

            Map<String, String> bodyReponse = new HashMap<>();
            bodyReponse.put("message", "User deleted successfully");

            return ResponseEntity.ok().body(bodyReponse);
        } catch (RuntimeException e) {
            String errorMessage = e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error deleting user: " + errorMessage);

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

    }

}
