package kz.iitu.springdataermapping.repository;

import kz.iitu.springdataermapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByNameContainsAndAge(String name, Integer age);
}
