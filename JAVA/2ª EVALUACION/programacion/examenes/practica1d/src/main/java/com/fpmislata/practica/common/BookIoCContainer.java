package com.fpmislata.practica.common;

import com.fpmislata.practica.domain.service.AuthorService;
import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.domain.service.impl.AuthorServiceImpl;
import com.fpmislata.practica.domain.service.impl.BookServiceImpl;
import com.fpmislata.practica.persistence.repository.AuthorRepository;
import com.fpmislata.practica.persistence.repository.BookRepository;
import com.fpmislata.practica.persistence.repository.impl.AuthorRepositoryImpl;
import com.fpmislata.practica.persistence.repository.impl.BookRepositoryImpl;
import com.fpmislata.practica.persistence.zdao.AuthorDao;
import com.fpmislata.practica.persistence.zdao.BookDao;
import com.fpmislata.practica.persistence.zdao.impl.AuthorDaoImpl;
import com.fpmislata.practica.persistence.zdao.impl.BookDaoImpl;

public class BookIoCContainer {
    private static BookService bookService;
    private static BookRepository bookRepository;
    private static BookDao bookDao;

    private static AuthorService authorService;
    private static AuthorRepository authorRepository;
    private static AuthorDao authorDao;

    public static BookService getBookService() {
        if (bookService == null) {
            bookService = new BookServiceImpl(getBookRepository());
        }
        return bookService;
    }

    private static BookRepository getBookRepository() {
        if (bookRepository == null) {
            bookRepository = new BookRepositoryImpl(getBookDao());
        }
        return bookRepository;
    }

    private static BookDao getBookDao() {
        if (bookDao == null) {
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }

    public static AuthorService getAuthorService() {
        if (authorService == null) {
            authorService = new AuthorServiceImpl(getAuthorRepository());
        }
        return authorService;
    }

    public static AuthorRepository getAuthorRepository() {
        if (authorRepository == null) {
            authorRepository = new AuthorRepositoryImpl(getAuthorDao());
        }
        return authorRepository;
    }

    public static AuthorDao getAuthorDao() {
        if (authorDao == null) {
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }
}