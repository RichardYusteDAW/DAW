package com.fpmislata.practica.domain.service;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.impl.BookRespository;

public class BookService {

    public List<Book> findAll() {
        BookRespository bookRespository = new BookRespository();

        return bookRespository.findAll();
    }
}