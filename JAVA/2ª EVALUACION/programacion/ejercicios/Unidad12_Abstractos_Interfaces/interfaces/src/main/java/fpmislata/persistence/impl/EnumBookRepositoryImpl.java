package fpmislata.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.domain.entinty.BookEnum;
import fpmislata.persistence.BookRepository;

public class EnumBookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> all() {
        /*
         * return List.of(
         * new Book(1, "El nombre de la rosa", "Umberto Eco"),
         * new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
         * new Book(3, "1Q84", "Haruki Murakami"));
         */
        List<Book> books = new ArrayList<>();
        for (BookEnum bookEnum : BookEnum.values()) {
            books.add(new Book(bookEnum.getId(), bookEnum.getTitle(), bookEnum.getAuthor()));
        }
        return books;
    }

}
