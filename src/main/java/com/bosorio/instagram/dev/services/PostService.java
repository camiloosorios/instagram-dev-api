package com.bosorio.instagram.dev.services;


import com.bosorio.instagram.dev.wsdl.post.Post;
import com.bosorio.instagram.dev.wsdl.post.PostUser;

import java.util.List;

public interface PostService {

    void create(Post post, String token);

    List<Post> findUserPosts(Long userId, String token);

    List<PostUser> findFollowingPosts(Long userId, String token);

    Post findById(Long id);

    void update(Post post, String token);

    void delete(Long id, String token);

}
