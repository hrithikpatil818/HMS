package com.hms.HMS.controller;

import com.hms.HMS.entity.Patient;
import com.hms.HMS.payload.PatientDto;
import com.hms.HMS.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {



    @Autowired
    private PatientService patientService;




    @PostMapping("/post")
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto){
        PatientDto patient = patientService.createPatient(patientDto);
        return new ResponseEntity<>(patient,HttpStatus.CREATED);
    }
}
