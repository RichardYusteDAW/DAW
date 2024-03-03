package crud.domain.service;

import java.util.List;

import crud.domain.entity.Movie;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(Integer id);

    void add(String title, Integer year, Integer directorId);
}