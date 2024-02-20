package com.fpmislata.practica.persistence.repository;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.entinty.Book;

//Todos lo métodos de la interfaz son públicos y abstractos.
public interface BookRepository {

    List<Book> findAll();

    Book findById(String id);

    void add(List<Book> books, List<Author> authors);
}