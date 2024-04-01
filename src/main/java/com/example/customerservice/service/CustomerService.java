package com.example.customerservice.service;

import com.example.customerservice.converter.CustomerConverter;
import com.example.customerservice.dto.CustomerRequest;
import com.example.customerservice.dto.CustomerResponse;
import com.example.customerservice.entity.Customer;
import com.example.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    private final CustomerConverter customerConverter;


    public CustomerResponse createCustomer(CustomerRequest request) {
        Customer customer = customerConverter.toCustomer(request);

        return customerConverter.toResponse(customerRepository.save(customer));
    }

}
