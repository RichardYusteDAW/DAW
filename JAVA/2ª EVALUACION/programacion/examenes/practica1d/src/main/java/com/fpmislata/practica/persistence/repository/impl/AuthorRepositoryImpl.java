package com.fpmislata.practica.persistence.repository.impl;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.persistence.repository.AuthorRepository;
import com.fpmislata.practica.persistence.zdao.AuthorDao;

public class AuthorRepositoryImpl implements AuthorRepository {

    AuthorDao authorDao;

    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;

    }

    public List<Author> findAll() {
        return authorDao.findAll();
    };

    public Author findById(String id) {
        return authorDao.findById(id);
    };
}