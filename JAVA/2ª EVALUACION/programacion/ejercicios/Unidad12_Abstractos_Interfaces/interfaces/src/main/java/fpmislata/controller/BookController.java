package fpmislata.controller;

import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.domain.service.BookService;

public class BookController {
    private BookService service = new BooksServiceImpl();

    public List<Book> getAll() {
        return this.service.getAll();
    }
}