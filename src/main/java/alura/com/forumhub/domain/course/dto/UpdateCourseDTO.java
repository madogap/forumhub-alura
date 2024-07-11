package alura.com.forumhub.domain.course.dto;

import alura.com.forumhub.domain.course.Categories;

public record UpdateCourseDTO(String name, Categories category) {
}
