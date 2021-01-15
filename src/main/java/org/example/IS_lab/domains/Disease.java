package org.example.IS_lab.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotBlank(message = "This field cannot be empty")
    @Size(max = 25, message = "Too long")
    private String name;


    @ManyToMany(mappedBy = "diseases",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Patient> patients = new HashSet<Patient>();


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "diseases_medicaments", joinColumns = {@JoinColumn(name = "disease_id")},
            inverseJoinColumns = {@JoinColumn(name = "medicament_id")})
    private Set<Medicament> medicaments = new HashSet<Medicament>();

    public Disease() {
    }

    public long getId() {
        return id;
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

    public Set<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
}
