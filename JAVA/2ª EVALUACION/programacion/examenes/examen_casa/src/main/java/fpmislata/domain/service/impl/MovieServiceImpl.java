package fpmislata.domain.service.impl;

import java.util.List;

import fpmislata.domain.entinty.Movie;
import fpmislata.domain.service.MovieService;
import fpmislata.persistence.repository.MovieRepository;

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