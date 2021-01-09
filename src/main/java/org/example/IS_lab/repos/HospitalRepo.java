package org.example.IS_lab.repos;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepo extends JpaRepository<Hospital,Long> {
    List<Hospital> findAll();

    Hospital findByName(String name);
}
