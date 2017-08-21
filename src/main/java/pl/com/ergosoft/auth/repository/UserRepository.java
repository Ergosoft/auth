package pl.com.ergosoft.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.ergosoft.auth.persistence.entity.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
