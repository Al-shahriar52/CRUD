package com.springboot.patientcrud.service;

import com.springboot.patientcrud.entity.Patient;
import com.springboot.patientcrud.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService{

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
}
