package org.example.IS_lab.repos;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.domains.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    List<Patient> findAll();
    Patient findByName(String name);
    List<Patient> findAllByAge(int age);
    List<Patient> findAllByDepartment(Department department);
}
