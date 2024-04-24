package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.wsdl.comment.Comment;
import com.bosorio.instagram.dev.wsdl.comment.FindPost;
import com.bosorio.instagram.dev.wsdl.comment.PostComment;

import java.util.List;

public interface CommentService {

    void create(Comment comment, String token);

    List<PostComment> findPostComments(Long postId);

    Comment findById(Long id);

    void update(Comment comment, String token);

    void delete(Long id, String token);

}
