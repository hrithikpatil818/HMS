package com.hms.HMS.service.impl;

import com.hms.HMS.entity.Patient;
import com.hms.HMS.payload.PatientDto;
import com.hms.HMS.repository.PatientRepository;
import com.hms.HMS.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = PatientServiceImpl.mapDtoToEntity(patientDto);
        Patient save = patientRepository.save(patient);
        PatientDto patientDto1 = PatientServiceImpl.mapEntityToDto(save);
        return patientDto1 ;
    }

    public static Patient mapDtoToEntity(PatientDto patientDto){

        Patient patientm = new Patient();

        patientm.setId(patientDto.getId());
        patientm.setName(patientDto.getName());
        patientm.setGender(patientDto.getGender());
        patientm.setDateOfBirth(patientDto.getDateOfBirth());
        patientm.setPhoneNumber(patientDto.getPhoneNumber());

        return patientm;
    }

    public static PatientDto mapEntityToDto(Patient patient){

        PatientDto patientDto = new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setName(patient.getName());
        patientDto.setGender(patient.getGender());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        patientDto.setPhoneNumber(patient.getPhoneNumber());

        return patientDto;

    }
}
