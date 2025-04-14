package com.web.bloguinho.dtos;

import jakarta.validation.constraints.NotBlank;

public record CommentDto(@NotBlank String author, @NotBlank String content) {
}