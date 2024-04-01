package com.example.customerservice.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CustomerRequest {
    private String name;
    private LocalDate birthDate;

}
