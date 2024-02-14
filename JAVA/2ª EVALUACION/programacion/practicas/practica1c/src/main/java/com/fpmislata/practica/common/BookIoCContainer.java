package com.fpmislata.practica.common;

import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.domain.service.impl.BookServiceImpl;
import com.fpmislata.practica.persistence.BookRepository;
import com.fpmislata.practica.persistence.impl.BookRespositoryImpl;

public class BookIoCContainer {
    private static BookService bookService;
    private static BookRepository bookRepository;

    private static BookRepository getBookRepository() {
        if (bookRepository == null) {
            bookRepository = new BookRespositoryImpl();
        }
        return bookRepository;
    }

    public static BookService getBookService() {
        if (bookService == null) {
            bookService = new BookServiceImpl(getBookRepository());
        }
        return bookService;
    }
}