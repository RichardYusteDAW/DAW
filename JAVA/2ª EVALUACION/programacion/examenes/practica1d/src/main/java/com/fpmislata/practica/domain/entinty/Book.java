package com.fpmislata.practica.domain.entinty;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int year;

    public Book(String title, Author author, String ISBN, String publisher, int year) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.year = year;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Book [id=" + id + ", title=" + title + ", author=" + author + ", ISBN=" + ISBN
                + ", publisher=" + publisher + ", year=" + year + "]" + "\u001B[0m";
    }

}