package com.fpmislata.practica.domain.service;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;

public interface BookService {
    public List<Book> findAll();

    public Book findById(int id);
}