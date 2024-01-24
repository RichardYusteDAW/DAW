package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    String verde = "\033[32m";
    String finalizaColor = "\033[0m";

    @GetMapping("/productos/{id}")
    public void getById(@PathVariable("id") int id) {
        System.out.println(verde + "Ruta: /productos/" + id + finalizaColor);
    }
}