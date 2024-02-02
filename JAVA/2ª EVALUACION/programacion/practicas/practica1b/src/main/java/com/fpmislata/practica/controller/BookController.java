package com.fpmislata.practica.controller;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.domain.service.impl.BookServiceImpl;

public class BookController {
    BookService bookService = new BookServiceImpl();

    public List<Book> findAll() {
        return bookService.findAll();
    }

    public Book findById(int id) {
        return bookService.findById(id);
    }
}
