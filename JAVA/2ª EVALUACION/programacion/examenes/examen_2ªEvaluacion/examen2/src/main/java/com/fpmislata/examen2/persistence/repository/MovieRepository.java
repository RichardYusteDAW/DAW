package com.fpmislata.examen2.persistence.repository;

import java.util.List;

import com.fpmislata.examen2.domain.entity.Movie;

public interface MovieRepository {

    List<Movie> findAll();

    Movie findById(Integer id);
}
