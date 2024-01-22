package fpmislata.controller;

import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.domain.service.BookService;
import fpmislata.domain.service.impl.BookServiceImpl;

public class BookController {
    private BookService bookService = new BookServiceImpl();

    public List<Book> getAll() {
        return bookService.getAll();
    }
}