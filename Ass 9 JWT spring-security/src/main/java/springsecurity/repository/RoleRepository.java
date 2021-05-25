package kz.iitu.springsecurityexample.repository;

import kz.iitu.springsecurityexample.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
