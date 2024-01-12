package com.example.back.controller;

import com.example.back.domain.Customer;
import com.example.back.domain.CustomerService;

public class CustomerController {
    private static CustomerService service = new CustomerService();
    private static String red = "\u001B[31m";
    private static String green = "\u001B[32m";
    private static String reset = "\u001B[0m";

    public static String findAll() {
        return green + "Clientes: " + service.findAll().toString() + reset + "\n";
    }

    public static String findById(int id) {
        Customer customer = service.findById(id);
        if (customer != null) {
            return green + customer.toString() + "\n" + reset;
        } else {
            return red + "Cliente no encontrado.\n" + reset;
        }
    }
}
