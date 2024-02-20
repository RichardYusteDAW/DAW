package com.fpmislata.practica.domain.service;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;

public interface BookService {

    List<Book> findAll();

    Book findById(String id);

    void add(Book book, String authorID);
}