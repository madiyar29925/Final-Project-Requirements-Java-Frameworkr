package kz.iitu.springdataermapping.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_courses",
            joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")}
    )
    private List<Course> courseList;

}
