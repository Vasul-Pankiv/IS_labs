package org.example.IS_lab.controller;

import org.example.IS_lab.domains.Department;
import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.repos.DepartmentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping
    public List<Department> list() {
        return departmentRepo.findAll();
    }

    @GetMapping("{id}")
    public Department getOne(@PathVariable("id") Department department) {
        return department;
    }

    @PutMapping("{id}")
    public Department update(@PathVariable("id") Department departmentFromDb,
                           @RequestBody Department department) {
        BeanUtils.copyProperties(departmentFromDb, department, "id");
        return departmentRepo.save(departmentFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Department department) {
        departmentRepo.delete(department);
    }


}
