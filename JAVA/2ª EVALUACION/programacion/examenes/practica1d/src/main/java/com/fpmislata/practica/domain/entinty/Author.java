package com.fpmislata.practica.domain.entinty;

import java.util.List;
import java.util.UUID;

public class Author {
    private String id;
    private String name;
    private String surname;
    private List<String> bookIds;

    public Author(String name, String surname, List<String> bookIds) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.bookIds = bookIds;
    }

    public String getId() {
        return this.id;
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

    public List<String> getBookIds() {
        return this.bookIds;
    }

    public void setBookIds(List<String> bookIds) {
        this.bookIds = bookIds;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Author [id=" + id + ", name=" + name + ", surname=" + surname + "]" + "\u001B[0m";
    }

}
