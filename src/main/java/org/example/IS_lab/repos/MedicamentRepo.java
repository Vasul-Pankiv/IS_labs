package org.example.IS_lab.repos;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.domains.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicamentRepo extends JpaRepository<Medicament,Long> {
    List<Medicament> findAll();
}
