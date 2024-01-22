package fpmislata.persistence.impl;

//import java.util.ArrayList;
import java.util.List;

import fpmislata.domain.entinty.Book;
import fpmislata.domain.entinty.BookEnum;
import fpmislata.persistence.BookRepository;

public class EnumBookRepositoryImpl implements BookRepository {
    List<Book> books = List.of(
            new Book(BookEnum.LIBRO1.getId(), BookEnum.LIBRO1.getTitle(), BookEnum.LIBRO1.getAuthor()),
            new Book(BookEnum.LIBRO2.getId(), BookEnum.LIBRO2.getTitle(), BookEnum.LIBRO2.getAuthor()),
            new Book(BookEnum.LIBRO3.getId(), BookEnum.LIBRO3.getTitle(), BookEnum.LIBRO3.getAuthor()));

    @Override
    public List<Book> all() {
        /*
         * List<Book> books = new ArrayList<>();
         * for (BookEnum bookEnum : BookEnum.values()) {
         * books.add(new Book(bookEnum.getId(), bookEnum.getTitle(),
         * bookEnum.getAuthor()));
         * }
         */
        return books;
    }

}
