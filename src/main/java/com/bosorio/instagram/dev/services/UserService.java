package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.wsdl.user.User;
import jakarta.xml.soap.SOAPException;

import java.util.List;

public interface UserService {

    String login(String email, String password);

    boolean verifyToken(String token);

    String create(User user);

    List<User> findAll();

    User findById(Long id);

    List<User> findByUsernameOrFullName(String param);

    User findByUsername(String username);

    User findByEmail(String email);

    void follow(Long follower_id, Long followed_id, String token) throws SOAPException;

    void unfollow(Long follower_id, Long followed_id, String token);

    List<User> findFollowers(Long userId);

    List<User> findFollowing(Long userId);

    void update(User user, String token);

    void delete(Long id, String token);

}
