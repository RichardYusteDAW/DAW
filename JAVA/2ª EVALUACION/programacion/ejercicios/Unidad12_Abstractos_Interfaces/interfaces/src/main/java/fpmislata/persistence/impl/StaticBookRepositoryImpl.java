package fpmislata.persistence.impl;

import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.persistence.BookRepository;

public class StaticBookRepositoryImpl implements BookRepository {
    List<Book> books = List.of(
            new Book(1, "El nombre de la rosa", "Umberto Eco"),
            new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
            new Book(3, "1Q84", "Haruki Murakami"));

    public List<Book> all() {
        return books;
    }
}