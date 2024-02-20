package com.fpmislata.practica.domain.service.impl;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.persistence.repository.AuthorRepository;
import com.fpmislata.practica.persistence.repository.BookRepository;

public class BookServiceImpl implements BookService {

    BookRepository bookRespository;
    AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public List<Book> findAll() {
        return bookRespository.findAll();
    }

    public Book findById(int id) {
        return bookRespository.findById(id);
    }

}