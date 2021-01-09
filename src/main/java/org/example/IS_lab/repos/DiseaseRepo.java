package org.example.IS_lab.repos;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Disease;
import org.example.IS_lab.domains.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiseaseRepo extends JpaRepository<Disease,Long> {
    List<Disease> findAll();
}
