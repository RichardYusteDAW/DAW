package com.fpmislata.practica.domain.entinty;

public class Book {
    private int id;
    private String title;
    private String author;
    private String ISBN;
    private String editorial;
    private int year;

    public Book(int id, String title, String author, String ISBN, String editorial, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.year = year;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
