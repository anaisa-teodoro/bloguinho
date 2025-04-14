package com.web.bloguinho.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.bloguinho.model.PostCommentModel;

@Repository
public interface PostCommentRepository extends JpaRepository<PostCommentModel, UUID> {
    List<PostCommentModel> findByPostId(UUID postId);
}