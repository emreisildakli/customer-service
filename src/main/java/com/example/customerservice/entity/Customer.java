package com.example.customerservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class Customer {
    private String name;
    private LocalDate birthDate;


    public Customer(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


}