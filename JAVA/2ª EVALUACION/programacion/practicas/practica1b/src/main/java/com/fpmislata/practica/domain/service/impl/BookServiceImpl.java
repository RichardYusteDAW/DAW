package com.fpmislata.practica.domain.service.impl;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.persistence.BookRepository;
import com.fpmislata.practica.persistence.impl.BookRespositoryImpl;

public class BookServiceImpl implements BookService {

    BookRepository bookRespository = new BookRespositoryImpl();

    public List<Book> findAll() {
        return bookRespository.findAll();
    }

    public Book findById(int id) {
        return bookRespository.findById(id);
    }

}