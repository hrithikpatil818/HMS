package com.hms.HMS.repository;

import com.hms.HMS.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing,Long> {
}
