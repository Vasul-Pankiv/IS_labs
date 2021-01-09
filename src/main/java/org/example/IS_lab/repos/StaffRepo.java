package org.example.IS_lab.repos;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.domains.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepo extends JpaRepository<Staff,Long> {
    List<Staff> findAll();
    List<Staff> findAllByDepartment(Department department);
    List<Staff> findAllByPosition(String position);
}
