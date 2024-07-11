package alura.com.forumhub.controller;


import alura.com.forumhub.domain.comment.CommentRepository;
import alura.com.forumhub.domain.comment.dto.CommentResponseDTO;
import alura.com.forumhub.infra.exceptions.Forbidden;
import alura.com.forumhub.infra.exceptions.NotFound;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/comments")
@SecurityRequirement(name = "bearer-key")
@RestController
public class CommentController {

    private final CommentRepository repository;

    public CommentController(CommentRepository commentRepository) {
        this.repository = commentRepository;
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<CommentResponseDTO> getCommentById(@PathVariable Long commentId) {
        var comment = repository.findById(commentId).orElseThrow(() -> new NotFound("Comment not found"));
        return ResponseEntity.ok(new CommentResponseDTO(comment));
    }

    @DeleteMapping("/{commentId}")
    @Transactional
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId, Authentication authentication) {
        var userId = authentication.getCredentials().toString();
        var comment = repository.findById(commentId).orElseThrow(() -> new NotFound("Comment not found"));
        if (!comment.getUser().getId().toString().equals(userId) &&
                authentication.getAuthorities().stream().noneMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"))) {
            throw new Forbidden("You do not have permission to perform this action");
        }

        repository.deleteById(commentId);
        return ResponseEntity.noContent().build();
    }
}
