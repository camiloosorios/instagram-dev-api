package com.bosorio.instagram.dev.services;

import com.bosorio.instagram.dev.clients.CommentClient;
import com.bosorio.instagram.dev.wsdl.comment.Comment;
import com.bosorio.instagram.dev.wsdl.comment.FindPost;
import com.bosorio.instagram.dev.wsdl.comment.PostComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceimpl implements CommentService {

    @Autowired
    private CommentClient commentClient;

    @Override
    public void create(Comment comment, String token) {
        commentClient.getCreateResponse(comment, token);
    }

    @Override
    public List<PostComment> findPostComments(Long postId) {
        return commentClient.getFindPostCommentsResponse(postId).getReturn();
    }

    @Override
    public Comment findById(Long id) {
        return commentClient.getFindByIdResponse(id).getReturn();
    }

    @Override
    public void update(Comment comment, String token) {
        commentClient.getUpdateResponse(comment, token);
    }

    @Override
    public void delete(Long id, String token) {
        commentClient.getDeleteResponse(id, token);
    }
}
