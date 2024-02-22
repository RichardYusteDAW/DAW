package fpmislata.persistence.repository;

import java.util.List;

import fpmislata.domain.entinty.Movie;

public interface MovieRepository {

    List<Movie> findAll();

    Movie findById(Integer id);
}
