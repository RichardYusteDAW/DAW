package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller; //es una anotación que marca una clase como controladora en el patrón MVC, manejando solicitudes y respuestas HTTP en una aplicación web
import org.springframework.web.bind.annotation.GetMapping; //es una anotación que proporciona un mapeo directo entre las solicitudes HTTP y los métodos de controlador.

@Controller
public class MainController {

    @GetMapping("/")
    public void index() {
        System.out.println("Método index de MainController ejecutándose");
    }

    @GetMapping("/about")
    public void about() {
        System.out.println("Método about de MainController ejecutándose");
    }

}