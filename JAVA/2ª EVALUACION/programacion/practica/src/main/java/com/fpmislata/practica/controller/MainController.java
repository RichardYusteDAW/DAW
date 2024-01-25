package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller; //es una anotación que marca una clase como controladora en el patrón MVC, manejando solicitudes y respuestas HTTP en una aplicación web
import org.springframework.web.bind.annotation.GetMapping; //es una anotación que proporciona un mapeo directo entre las solicitudes HTTP y los métodos de controlador.

@Controller
public class MainController {
    String azul = "\033[34m";
    String finalizaColor = "\033[0m";

    @GetMapping("/")
    public String index() {
        System.out.println(azul + "Método INDEX de MainController ejecutándose" + finalizaColor);
        return "index";
    }

    @GetMapping("/about")
    public void about() {
        System.out.println(azul + "Método ABOUT de MainController ejecutándose" + finalizaColor);
    }

}