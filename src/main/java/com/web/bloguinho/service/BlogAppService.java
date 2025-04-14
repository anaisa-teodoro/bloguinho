package com.web.bloguinho.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.web.bloguinho.model.PostCommentModel;
import com.web.bloguinho.model.PostModel;

public interface BlogAppService {

	List<PostModel> findAll();
	Optional<PostModel> findById(UUID id);
	PostModel save(PostModel post);
	void delete(PostModel post);

	// Comment related methods
	List<PostCommentModel> findAllComments();
	List<PostCommentModel> findCommentsByPostId(UUID postId);
	Optional<PostCommentModel> findCommentById(UUID id);
	PostCommentModel saveComment(PostCommentModel comment);
	void deleteComment(PostCommentModel comment);
}