package com.fpmislata.practica.domain.entinty;

public class Author {
    Integer id;
    String name;
    String surname;
    Integer[] bookIds;

    public Author(Integer id, String name, String surname, Integer[] bookIds) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.bookIds = bookIds;
    }

    public Integer getId() {
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

    public Integer[] getBookIds() {
        return this.bookIds;
    }

    public void setBookIds(Integer[] bookIds) {
        this.bookIds = bookIds;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Author [id=" + id + ", name=" + name + ", surname=" + surname + "]" + "\u001B[0m";
    }

}
