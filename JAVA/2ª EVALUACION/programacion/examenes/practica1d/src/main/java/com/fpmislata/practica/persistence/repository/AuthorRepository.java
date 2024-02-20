package com.fpmislata.practica.persistence.repository;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;

public interface AuthorRepository {

    List<Author> findAll();

    Author findById(String id);
}
