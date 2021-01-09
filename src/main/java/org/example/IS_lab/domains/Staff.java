package org.example.IS_lab.domains;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotBlank(message = "This field cannot be empty")
    @Size(max = 25, message = "Too long")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "This field cannot be empty")
    @Size(max = 25, message = "Too long")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "position")
    private String position;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(mappedBy = "staff",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Patient> patients  = new HashSet<Patient>();

    public Staff() {
    }

    public long getId() {
        return id;
    }
}
