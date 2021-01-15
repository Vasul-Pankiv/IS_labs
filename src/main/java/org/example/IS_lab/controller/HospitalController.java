package org.example.IS_lab.controller;

import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.repos.HospitalRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hospital")
public class HospitalController {
    @Autowired
    private HospitalRepo hospitalRepo;

    @GetMapping
    public List<Hospital> list() {
        return hospitalRepo.findAll();
    }

    @GetMapping("{id}")
    public Hospital getOne(@PathVariable("id") Hospital hospital) {
        return hospital;
    }

    @PutMapping("{id}")
    public Hospital update(@PathVariable("id") Hospital hospitalFromDb,
                           @RequestBody Hospital hospital) {
        BeanUtils.copyProperties(hospitalFromDb, hospital, "id");
        return hospitalRepo.save(hospitalFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Hospital hospital) {
        hospitalRepo.delete(hospital);
    }


}
