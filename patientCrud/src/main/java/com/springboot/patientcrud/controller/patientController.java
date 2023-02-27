package com.springboot.patientcrud.controller;

import com.springboot.patientcrud.entity.Patient;
import com.springboot.patientcrud.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {

    @Autowired
    public PatientService patientService;

    @PostMapping("/savePatient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

}
