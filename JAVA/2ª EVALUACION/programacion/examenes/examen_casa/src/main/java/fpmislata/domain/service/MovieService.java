package fpmislata.domain.service;

import java.util.List;

import fpmislata.domain.entinty.Movie;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(Integer id);
}
