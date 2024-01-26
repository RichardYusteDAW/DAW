package com.example.back.persistance;

import java.util.ArrayList;
import java.util.List;

import com.example.back.domain.Customer;

public class CustomerDao {

    private List<Customer> customers = new ArrayList<>();

    public CustomerDao() {
        customers.add(new Customer(1, "John", "AAAA"));
        customers.add(new Customer(2, "Mary", "BBBB"));
        customers.add(new Customer(3, "Peter", "CCCC"));
        customers.add(new Customer(4, "David", "DDDD"));
    }

    public List<Customer> findAll() {
        return customers;
    }

    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getID() == id) {
                return customer;
            }
        }
        return null;
    }
}