package com.example.back.domain;

import com.example.back.persistance.CustomerDao;
import java.util.List;

public class CustomerService {

    private CustomerDao dao = new CustomerDao();

    public List<Customer> findAll() {
        return dao.findAll();
    }

    public Customer findById(int id) {
        return dao.findById(id);
    }
}