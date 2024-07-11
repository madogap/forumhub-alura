package alura.com.forumhub.domain.user.dto;

import alura.com.forumhub.domain.user.User;
import alura.com.forumhub.domain.user.UserRoles;
import com.fasterxml.jackson.annotation.JsonProperty;

public record UserResponseDTO(Long id,
                              String name,

                              @JsonProperty("is_active")
                               boolean isActive,

                              UserRoles role) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getName(), user.isActive(), user.getRole());
    }
}
