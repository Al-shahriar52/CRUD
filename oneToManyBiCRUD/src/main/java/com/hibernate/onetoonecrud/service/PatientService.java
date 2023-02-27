package com.hibernate.onetoonecrud.service;

import com.hibernate.onetoonecrud.entity.Patient;
import com.hibernate.onetoonecrud.repository.PatientDetailsRepository;
import com.hibernate.onetoonecrud.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;


    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }


    public Patient savePatient(Patient patient){
//        Patient patient1 = patientRepository.findById(patdet.getPatinetId)
////
////          PatinetDetails pa = new Patient()
////
////          pd.set
////
////          pd.setPat

        return patientRepository.save(patient);
    }

    public List<Patient> savePatients(List<Patient> patients){
        return patientRepository.saveAll(patients);
    }

    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id){
        return patientRepository.findById(id).orElse(null);
    }

    public String deletePatientById(Long id){
        patientRepository.deleteById(id);
        return "patient delete successfull"+id ;
    }

    public Patient updatePatient(Patient patient){
        Patient existPatient = patientRepository.findById(patient.getId()).orElse(null);

        existPatient.setName(patient.getName());
        existPatient.setAge(patient.getAge());
        existPatient.setAddress(patient.getAddress());
        existPatient.setTotalLabCost(patient.getTotalLabCost());

        return patientRepository.save(existPatient);

    }


}
