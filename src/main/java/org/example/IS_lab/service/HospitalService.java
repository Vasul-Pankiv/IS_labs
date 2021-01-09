package org.example.IS_lab.service;

import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.repos.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepo hospitalRepo;

    public void addHospital(Hospital hospital) {
        hospitalRepo.save(hospital);
    }

    public void deleteHospital(Hospital hospital) {
        hospitalRepo.delete(hospital);
    }

    public List<Hospital> findAll() {
        return hospitalRepo.findAll();
    }

    public Hospital findByName(String name) {
        return hospitalRepo.findByName(name);
    }

    public void delete(Hospital hospital) {
        hospitalRepo.delete(hospital);
    }
}
