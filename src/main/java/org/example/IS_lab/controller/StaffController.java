package org.example.IS_lab.controller;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.domains.Staff;
import org.example.IS_lab.repos.DepartmentRepo;
import org.example.IS_lab.repos.HospitalRepo;
import org.example.IS_lab.repos.StaffRepo;
import org.example.IS_lab.service.DepartmentService;
import org.example.IS_lab.service.HospitalService;
import org.example.IS_lab.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private StaffService staffService;

    @GetMapping
    public String displayStaffList(
            @RequestParam(required = false) Hospital hospital,
            @RequestParam(required = false) Department department,
            Model model) {
        List<Staff> staffList;
        if(hospital==null && department == null){
            staffList = staffService.findAll();
        }
        else if(hospital!=null){
            staffList = staffService.findAllByHospital(hospital);
        }
        else {
            staffList = staffService.findAllByDepartment(department);
        }

        model.addAttribute("staffList",staffList);
        return "greeting";
    }


}
