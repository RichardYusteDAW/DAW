package com.fpmislata.practica.persistence.zdao;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;

public interface AuthorDao {

    public Author findById(String id);

    public List<Author> findAll();

    public void add(List<Author> authors);

}
