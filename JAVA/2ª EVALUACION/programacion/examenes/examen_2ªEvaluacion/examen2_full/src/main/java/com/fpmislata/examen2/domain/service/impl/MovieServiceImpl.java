package com.fpmislata.examen2.domain.service.impl;

import java.util.List;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.persistence.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(Integer id) {
        return movieRepository.findById(id);
    }
}
