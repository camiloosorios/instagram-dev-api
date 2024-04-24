package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.clients.PostClient;
import com.bosorio.instagram.dev.wsdl.post.Post;
import com.bosorio.instagram.dev.wsdl.post.PostUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostClient postClient;

    @Override
    public void create(Post post, String token) {
        postClient.getCreateResponse(post, token);
    }

    @Override
    public List<Post> findUserPosts(Long userId, String token) {
        return postClient.getFindUserPostsResponse(userId, token).getReturn();
    }

    @Override
    public List<PostUser> findFollowingPosts(Long userId, String token) {
        return postClient.getFindFollowingPostsResponse(userId, token).getReturn();
    }


    @Override
    public Post findById(Long id) {
        return postClient.getFindByIdResponse(id).getReturn();
    }

    @Override
    public void update(Post post, String token) {
        postClient.getUpdateResponse(post, token);
    }

    @Override
    public void delete(Long id, String token) {
        postClient.getDeleteResponse(id, token);
    }
}
