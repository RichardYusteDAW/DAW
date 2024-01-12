package com.example.back.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll() {
        return customers;
    }
}
