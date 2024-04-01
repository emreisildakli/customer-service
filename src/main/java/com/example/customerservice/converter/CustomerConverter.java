package com.example.customerservice.converter;

import com.example.customerservice.dto.CustomerRequest;
import com.example.customerservice.dto.CustomerResponse;
import com.example.customerservice.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    public Customer toCustomer(CustomerRequest request) {
        return Customer.builder()
                .name(request.getName())
                .birthDate(request.getBirthDate())
                .build();
    }

    public CustomerResponse toResponse(Customer customer) {
        return CustomerResponse.builder()
                .birthDate(customer.getBirthDate())
                .name(customer.getName())
                .build();
    }
}
