package com.fpmislata.practica.domain.entinty;

public class Author {
    int id;
    String name;
    String surname;
    String nationality;

    public Author(int id, String name, String surname, String nationality) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
