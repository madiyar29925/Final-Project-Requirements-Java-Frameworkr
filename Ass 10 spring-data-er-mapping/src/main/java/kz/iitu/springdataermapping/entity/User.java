package kz.iitu.springdataermapping.entity;

import lombok.*;

import javax.persistence.*;

@Entity
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode(of={"id"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

}
