package com.fpmislata.practica.persistence.zdao;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;

public interface BookDao {
    public Book findById(int id);

    public List<Book> findAll();
}
