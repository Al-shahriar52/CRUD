package com.springboot.patientcrud.repository;

import com.springboot.patientcrud.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    //Patient addPatient(Patient patient);

}
