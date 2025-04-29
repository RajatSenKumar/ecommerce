package com.blog.service.impl;

import com.blog.entity.Comment;
import com.blog.entity.Post;
import com.blog.exception.ResourceNotFoundException;
import com.blog.payload.CommentDto;
import com.blog.payload.PostDto;
import com.blog.repository.CommentRepository;
import com.blog.repository.PostRepository;
import com.blog.service.CommentService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDto createComment(long postId, CommentDto commentDto) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post is not found with this id" + postId)
        );
        Comment comment = new Comment();
        comment.setBody(commentDto.getBody());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setPost(post);
        Comment savedComment = commentRepository.save(comment);
        CommentDto dto = new CommentDto();
        dto.setId(savedComment.getId());
        dto.setName(savedComment.getName());
        dto.setBody(savedComment.getBody());
        dto.setEmail(savedComment.getEmail());
        return dto;
    }

    @Override
    public void deleteComment(long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(
                () -> new ResourceNotFoundException("Comment is not found with this id:" + commentId));
                commentRepository.deleteById(commentId);
    }

    @Override
    public List<CommentDto> getCommentsByPostId(long postId) {
        List<Comment> comments = commentRepository.findByPostId(postId);
        List<CommentDto> commentDtos = comments.stream().map(c -> mapTODto(c)).collect(Collectors.toList());
        return commentDtos;
    }

    @Override
    public CommentDto updateCommentByCommentId(long commentId, CommentDto commentDto) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(
                () -> new ResourceNotFoundException("Post is not found with this id:" + commentId)
        );
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());
        Comment savedComment = commentRepository.save(comment);
        CommentDto dto = mapTODto(savedComment);
        return dto;
    }

    @Override
    public List<CommentDto> getAllComments() {
        List<Comment> comments = commentRepository.findAll();
        List<CommentDto> dtos = comments.stream().map(c -> mapTODto(c)).collect(Collectors.toList());
        return dtos;
    }

    CommentDto mapTODto(Comment comment){
            CommentDto dto = new CommentDto();
            dto.setId(comment.getId());
            dto.setName(comment.getName());
            dto.setBody(comment.getBody());
            dto.setEmail(comment.getEmail());
            return dto;
        }
}
