package com.fpmislata.practica.persistence;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;

public interface AuthorRepository {

    List<Author> findAll();

    Author findById(int id);
}
