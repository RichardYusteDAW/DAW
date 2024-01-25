package com.fpmislata.practica.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpmislata.practica.domain.entinty.Product;

@RequestMapping("/products")
@Controller
public class ProductController {
    String verde = "\033[32m";
    String finalizaColor = "\033[0m";

    List<Product> products = List.of(
            new Product(1, "Producto A", "Marca A", new BigDecimal(23.99)),
            new Product(2, "Producto B", "Marca A", new BigDecimal(14.99)),
            new Product(3, "Producto C", "Marca B", new BigDecimal(68.99)));

    // @GetMapping("/productos/{id}")
    // public void getById(@PathVariable("id") int id) {
    // System.out.println(verde + "Ruta: /productos/" + id + finalizaColor);
    // }
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(verde + "Ruta: /products/" + id + finalizaColor);
                model.addAttribute("product", product);
                break;
            }
        }
        return "productDetails";
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("products", this.products);
        return "products";
    }
}