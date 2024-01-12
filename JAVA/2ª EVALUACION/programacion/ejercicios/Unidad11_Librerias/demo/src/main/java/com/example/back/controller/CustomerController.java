package com.example.back.controller;

public class CustomerController {
    public static String findAll() {
        String green = "\u001B[32m";
        String resetColor = "\u001B[0m";
        return green + "Listado de todos los clientes\n" + resetColor;
    }
}
