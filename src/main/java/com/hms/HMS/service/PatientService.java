package com.hms.HMS.service;

import com.hms.HMS.entity.Patient;
import com.hms.HMS.payload.PatientDto;

public interface PatientService {

    public PatientDto createPatient(PatientDto patientDto);
}
