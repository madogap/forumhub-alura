package alura.com.forumhub.domain.topic.dto;

import alura.com.forumhub.domain.topic.Status;

public record UpdateTopicDTO(String title,
                             String text,
                             Status status) {
}
