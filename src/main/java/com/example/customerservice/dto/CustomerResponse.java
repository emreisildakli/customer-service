package com.example.customerservice.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class CustomerResponse {
    private String name;
    private LocalDate birthDate;
}
