package com.hms.HMS.payload;

import lombok.Data;

@Data
public class MedicalHistoryDto {

    private String allergies;
    private String previousIllness;
    private String currentMedication;
}
