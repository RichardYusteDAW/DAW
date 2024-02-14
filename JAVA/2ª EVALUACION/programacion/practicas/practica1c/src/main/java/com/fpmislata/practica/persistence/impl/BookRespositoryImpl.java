package com.fpmislata.practica.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.BookRepository;

public class BookRespositoryImpl implements BookRepository {

    List<Book> books = new ArrayList<Book>();

    public BookRespositoryImpl() {
        books.add(new Book(1, "El señor de los anillos", "J.R.R. Tolkien", "978-84-450-7426-2", "Minotauro", 1954));
        books.add(new Book(2, "El hobbit", "J.R.R. Tolkien", "978-84-450-7426-2", "Minotauro", 1937));
        books.add(new Book(3, "El Silmarillion", "J.R.R. Tolkien", "978-84-450-7426-2", "Minotauro", 1977));
        books.add(new Book(4, "El nombre del viento", "Patrick Rothfuss", "978-84-450-7426-2", "Plaza & Janés", 2007));
        books.add(new Book(5, "Elantris", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2005));
        books.add(new Book(6, "El imperio final", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2006));
        books.add(new Book(7, "El pozo de la ascensión", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2007));
        books.add(new Book(8, "El héroe de las eras", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2008));
        books.add(new Book(9, "El aliento de los dioses", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2009));
        books.add(new Book(10, "El camino de los reyes", "Brandon Sanderson", "978-84-450-7426-2", "Nova", 2010));
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}