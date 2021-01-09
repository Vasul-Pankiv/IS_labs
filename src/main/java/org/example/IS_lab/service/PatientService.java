package org.example.IS_lab.service;

import org.example.IS_lab.domains.Patient;
import org.example.IS_lab.repos.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public List<Patient> findAll(){
        return patientRepo.findAll();
    }
    public void addPatient(Patient patient){
        patientRepo.save(patient);
    }
    public void deletePatient(Patient patient){
        patientRepo.delete(patient);
    }
}
