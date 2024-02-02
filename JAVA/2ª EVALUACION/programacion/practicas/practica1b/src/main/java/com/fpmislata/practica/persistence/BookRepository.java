package com.fpmislata.practica.persistence;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;

//Todos lo métodos de la interfaz son públicos y abstractos.
public interface BookRepository {
    List<Book> findAll();

    Book findById(int id);
}