package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.clients.UserClient;
import com.bosorio.instagram.dev.wsdl.user.User;
import jakarta.xml.soap.SOAPException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserClient userClient;

    @Override
    public String login(String email, String password) {
        return userClient.getLoginResponse(email, password).getReturn().toString();
    }

    @Override
    public boolean verifyToken(String token) {
        return userClient.getVerifyTokenResponse(token).isReturn();
    }

    @Override
    public String create(User user) {
        return userClient.getCreateResponse(user).getReturn();
    }

    @Override
    public List<User> findAll() {
        return userClient.getFindAllResponse().getReturn();
    }

    @Override
    public User findById(Long id) {
        return userClient.getFindByIdResponse(id).getReturn();
    }

    @Override
    public List<User> findByUsernameOrFullName(String param) {
        return userClient.getFindByUsernameOrFullNameResponse(param).getReturn();
    }

    @Override
    public User findByUsername(String username) {
        return userClient.getFindByUsernameResponse(username).getReturn();
    }

    @Override
    public User findByEmail(String email) {
        return userClient.getFindByEmailResponse(email).getReturn();
    }

    @Override
    public void follow(Long follower_id, Long followed_id, String token) throws SOAPException {
        userClient.getFollowResponse(follower_id, followed_id, token);
    }

    @Override
    public void unfollow(Long follower_id, Long followed_id, String token) {
        userClient.getUnfollowResponse(follower_id, followed_id, token);
    }

    @Override
    public List<User> findFollowers(Long userId) {
        return userClient.getFindFollowersResponse(userId).getReturn();
    }

    @Override
    public List<User> findFollowing(Long userId) {
        return userClient.getFindFollowingResponse(userId).getReturn();
    }

    @Override
    public void update(User user, String token) {
        userClient.getUpdateResponse(user, token);
    }

    @Override
    public void delete(Long id, String token) {
        userClient.getDeleteResponse(id, token);
    }
}
