package com.example.back.domain;

public class Customer {
    private int id;
    private String name;
    private String nif;

    public Customer(int id, String name, String nif) {
        this.id = id;
        this.name = name;
        this.nif = nif;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNif() {
        return this.nif;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + ", nif=" + nif + "}";
    }
}
