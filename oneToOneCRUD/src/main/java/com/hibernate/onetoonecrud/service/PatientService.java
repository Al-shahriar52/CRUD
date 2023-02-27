package com.hibernate.onetoonecrud.service;

import com.hibernate.onetoonecrud.entity.Patient;
import com.hibernate.onetoonecrud.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
}
