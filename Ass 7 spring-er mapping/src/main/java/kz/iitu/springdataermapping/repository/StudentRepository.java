package kz.iitu.springdataermapping.repository;

import kz.iitu.springdataermapping.entity.Student;
import kz.iitu.springdataermapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
