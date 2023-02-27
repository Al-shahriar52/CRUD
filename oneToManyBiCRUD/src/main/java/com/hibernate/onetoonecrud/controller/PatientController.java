package com.hibernate.onetoonecrud.controller;

import com.hibernate.onetoonecrud.entity.Patient;
import com.hibernate.onetoonecrud.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class PatientController {

    public PatientService patientService;
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @PostMapping("/savePatient")
    public Patient savePatient(@RequestBody Patient patient){

        return patientService.savePatient(patient);
    }

    @PostMapping("/savePatients")
    public  ResponseEntity<?> savePatients(@RequestBody List<Patient> patient){
        List<Patient> patients = patientService.savePatients(patient);
        return  ResponseEntity.ok(patients);
    }





}
