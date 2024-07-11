package alura.com.forumhub.domain.course.dto;

import alura.com.forumhub.domain.course.Categories;
import jakarta.validation.constraints.NotBlank;

public record CreateCourseDTO(@NotBlank String name, Categories category) {
}
