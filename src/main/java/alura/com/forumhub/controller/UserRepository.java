package alura.com.forumhub.controller;

import alura.com.forumhub.domain.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByEmailAndIsActiveTrue(String email);

    Page<User> findAllByIsActiveTrue(Pageable pagination);
}
