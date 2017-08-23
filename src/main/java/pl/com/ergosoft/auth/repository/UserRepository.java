package pl.com.ergosoft.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.ergosoft.auth.persistence.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
