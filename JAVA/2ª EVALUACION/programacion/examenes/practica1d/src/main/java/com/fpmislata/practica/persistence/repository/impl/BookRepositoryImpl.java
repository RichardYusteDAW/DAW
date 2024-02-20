package com.fpmislata.practica.persistence.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.fpmislata.practica.common.BookIoCContainer;
import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.repository.BookRepository;
import com.fpmislata.practica.persistence.zdao.AuthorDao;
import com.fpmislata.practica.persistence.zdao.BookDao;

public class BookRepositoryImpl implements BookRepository {

    BookDao bookDao;
    AuthorDao authorDao;

    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
        this.authorDao = BookIoCContainer.getAuthorDao();
    }

    public List<Book> findAll() {

        // Busca todos los libros
        List<Book> books = bookDao.findAll();

        // Busca todos los autores
        List<Author> authors = BookIoCContainer.getAuthorDao().findAll();

        // Añade el autor a cada libro
        for (Book book : books) {
            for (Author author : authors) {
                if (author.getBookIds().contains(book.getId())) {
                    book.setAuthor(author);
                }
            }
        }

        // Devuelve la lista de libros
        return books;
    };

    public Book findById(String id) {
        return bookDao.findById(id);
    };

    public void add(List<Book> books, List<Author> authors) {
        bookDao.add(books);
        authorDao.add(authors);
    };
}