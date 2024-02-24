package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

public class MovieMapper {
    public static Movie toMovie(MovieEntity movieEntity) {

        Integer id = movieEntity.getId();
        String title = movieEntity.getTitle();
        Integer year = movieEntity.getYear();

        return new Movie(id, title, year);
    }

    public static MovieEntity toMovieEntity(Movie movie) {

        Integer id = movie.getId();
        String title = movie.getTitle();
        Integer year = movie.getYear();
        Integer idDirector = movie.getDirector().getId();

        return new MovieEntity(id, title, year, idDirector);
    }
}
