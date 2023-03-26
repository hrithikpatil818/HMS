package com.hms.HMS.payload;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AppointmentDto {

    private LocalDateTime appointmentDate;
    private String reasonForVisit;
}
