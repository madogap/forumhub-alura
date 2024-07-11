package alura.com.forumhub.domain.user.dto;

import jakarta.validation.constraints.Email;

public record UserUpdateDTO(String name,
                            @Email
                            String email,
                            String password) {
}
