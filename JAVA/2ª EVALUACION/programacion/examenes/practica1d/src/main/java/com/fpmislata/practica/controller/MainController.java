package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String procesarFormularioContacto(Model model,
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("asunto") String asunto,
            @RequestParam("mensaje") String mensaje) {

        model.addAttribute("nombre", nombre);
        model.addAttribute("email", email);
        model.addAttribute("asunto", asunto);
        model.addAttribute("mensaje", mensaje);

        return "confirmation";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
