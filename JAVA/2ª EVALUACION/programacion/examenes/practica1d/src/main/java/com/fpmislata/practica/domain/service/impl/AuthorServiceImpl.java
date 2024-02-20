package com.fpmislata.practica.domain.service.impl;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.service.AuthorService;
import com.fpmislata.practica.persistence.repository.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    };

    public Author findById(String id) {
        return authorRepository.findById(id);
    };
}