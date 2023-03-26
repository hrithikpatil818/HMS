package com.hms.HMS.repository;

import com.hms.HMS.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    List<Appointment> findByPatientId(Long patientId);
}
