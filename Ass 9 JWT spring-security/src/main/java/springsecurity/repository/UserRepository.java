package kz.iitu.springsecurityexample.repository;

import kz.iitu.springsecurityexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
