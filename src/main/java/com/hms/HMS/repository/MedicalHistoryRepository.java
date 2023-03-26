package com.hms.HMS.repository;

import com.hms.HMS.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory,Long> {
}
