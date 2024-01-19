package fpmislata.persistence;

import java.util.List;

import fpmislata.domain.entinty.Book;

public interface BookRepository {

    public List<Book> all();
}
