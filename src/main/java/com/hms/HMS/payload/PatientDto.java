package com.hms.HMS.payload;

import lombok.Data;

import java.util.List;

@Data
public class PatientDto {

    private Long id;

    private String name;
    private String dateOfBirth;
    private String gender;
    private long phoneNumber;
    private MedicalHistoryDto medicalHistoryDto;
    private List<AppointmentDto> appointmentDto;
    private BillingDto billingDto;

}
