package org.example.IS_lab.controller;

import org.example.IS_lab.domains.Staff;
import org.example.IS_lab.repos.StaffRepo;
import org.example.IS_lab.repos.StaffRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffRepo staffRepo;

    @GetMapping
    public List<Staff> list() {
        return staffRepo.findAll();
    }

    @GetMapping("{id}")
    public Staff getOne(@PathVariable("id") Staff staff) {
        return staff;
    }

    @PutMapping("{id}")
    public Staff update(@PathVariable("id") Staff staffFromDb,
                           @RequestBody Staff staff) {
        BeanUtils.copyProperties(staffFromDb, staff, "id");
        return staffRepo.save(staffFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Staff staff) {
        staffRepo.delete(staff);
    }


}
