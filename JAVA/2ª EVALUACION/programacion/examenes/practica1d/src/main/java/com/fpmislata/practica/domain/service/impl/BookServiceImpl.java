package com.fpmislata.practica.domain.service.impl;

import java.util.List;

import com.fpmislata.practica.common.BookIoCContainer;
import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.domain.service.BookService;
import com.fpmislata.practica.persistence.repository.AuthorRepository;
import com.fpmislata.practica.persistence.repository.BookRepository;

public class BookServiceImpl implements BookService {

    BookRepository bookRespository;
    AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRespository) {
        this.bookRespository = bookRespository;
        this.authorRepository = BookIoCContainer.getAuthorRepository();
    }

    public List<Book> findAll() {
        return bookRespository.findAll();
    }

    public Book findById(String id) {
        return bookRespository.findById(id);
    }

    public void add(Book book, String authorID) {
        // Añade el libro
        List<Book> books = bookRespository.findAll();
        books.add(book);

        // Añade el libro al autor
        List<Author> authors = authorRepository.findAll();
        for (Author author : authors) {
            if (author.getId().equals(authorID)) {
                author.getBookIds().add(book.getId());
            }
        }

        // Devuelve la lista de libros y la lista de autores
        bookRespository.add(books, authors);
    }
}