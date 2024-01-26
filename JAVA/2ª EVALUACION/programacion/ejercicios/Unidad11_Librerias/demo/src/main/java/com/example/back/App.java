package com.example.back;

import com.example.back.controller.CustomerController;

public class App {
    public static void response() {
        System.out.println(CustomerController.findAll());
    }
}