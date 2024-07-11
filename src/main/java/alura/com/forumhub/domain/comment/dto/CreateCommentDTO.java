package alura.com.forumhub.domain.comment.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCommentDTO(@NotBlank String text) {
}
