package com.example.customerservice.repository;

import com.example.customerservice.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customerList = new ArrayList<>();


    public Customer save(Customer customer) {
        customerList.add(customer);
        return customer;
    }
}
