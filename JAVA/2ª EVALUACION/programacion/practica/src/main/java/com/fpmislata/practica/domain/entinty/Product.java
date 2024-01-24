package com.fpmislata.practica.domain.entinty;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private String brand;
    private BigDecimal price;

    public Product(int id, String name, String brand, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }
}