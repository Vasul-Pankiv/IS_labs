package org.example.IS_lab.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotBlank(message = "This field cannot be empty")
    @Size(max = 25, message = "Too long")
    private String name;


    @ManyToMany(mappedBy = "medicaments",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Patient> patients  = new HashSet<Patient>();


    @ManyToMany(mappedBy = "medicaments",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Disease> diseases = new HashSet<Disease>();
    public long getId() {
        return id;
    }

    public Medicament() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Set<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(Set<Disease> diseases) {
        this.diseases = diseases;
    }
}
