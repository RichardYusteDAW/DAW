package com.fpmislata.practica.domain.service.impl;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.service.AuthorService;
import com.fpmislata.practica.persistence.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return null;
    };

    public Author findById(int id) {
        return null;
    };
}