package com.fpmislata.examen2.domain.service;

import java.util.List;

import com.fpmislata.examen2.domain.entity.Movie;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(Integer id);
}
