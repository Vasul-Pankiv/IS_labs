package org.example.IS_lab.service;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.domains.Staff;
import org.example.IS_lab.repos.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepo staffRepo;
    public List<Staff> findAll() {

        return staffRepo.findAll();
    }
    public List<Staff> findAllByHospital(Hospital hospital){
        List<Staff> staffList = new ArrayList<>();
        for(Department department: hospital.getDepartments()){
            staffList.addAll(department.getStaff());
        }
        return staffList;
    }

    public List<Staff> findAllByDepartment(Department department) {
        return staffRepo.findAllByDepartment(department);
    }
}
