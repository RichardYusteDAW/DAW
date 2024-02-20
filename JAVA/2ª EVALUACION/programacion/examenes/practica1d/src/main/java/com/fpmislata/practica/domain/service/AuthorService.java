package com.fpmislata.practica.domain.service;

import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;

public interface AuthorService {

    List<Author> findAll();

    Author findById(String id);
}