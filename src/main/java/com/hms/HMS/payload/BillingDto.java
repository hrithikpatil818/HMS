package com.hms.HMS.payload;

import lombok.Data;

@Data
public class BillingDto {


    private String insuranceProvider;

    private String policyNumber;

    private double totalAmount;
}
