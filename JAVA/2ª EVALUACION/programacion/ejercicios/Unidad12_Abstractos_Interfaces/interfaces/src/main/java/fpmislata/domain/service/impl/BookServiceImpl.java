package fpmislata.domain.service.impl;

import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.domain.service.BookService;
import fpmislata.persistence.BookRepository;
import fpmislata.persistence.impl.EnumBookRepositoryImpl;
//import fpmislata.persistence.impl.StaticBookRepositoryImpl;

public class BookServiceImpl implements BookService {
    // private BookRepository bookRepository = new StaticBookRepositoryImpl();
    private BookRepository bookRepository = new EnumBookRepositoryImpl();

    @Override
    public List<Book> getAll() {
        return this.bookRepository.all();
    }
}