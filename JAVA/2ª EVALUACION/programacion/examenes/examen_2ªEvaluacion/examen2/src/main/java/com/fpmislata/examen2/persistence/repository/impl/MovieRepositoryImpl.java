package com.fpmislata.examen2.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examen2.common.container.ActorIoC;
import com.fpmislata.examen2.common.container.CharacterMovieIoC;
import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Actor;
import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.ActorEntity;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.ActorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

public class MovieRepositoryImpl implements MovieRepository {
    MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> findAll() {
        // Busca todas las películas y las mappea a una lista de objetos Movie.
        List<Movie> movies = new ArrayList<Movie>();
        Movie movie;

        for (MovieEntity movieEntity : movieDao.findAll()) {
            movie = findById(movieEntity.getId());
            movies.add(movie);
        }

        return movies;
    }

    public Movie findById(Integer id) {
        // Busca la película y la mappea a un objeto Movie.
        MovieEntity movieEntity = movieDao.findById(id);
        Movie movie = MovieMapper.toMovie(movieEntity);

        // Busca el director de la película y lo mappea a un objeto Director.
        DirectorEntity directorEntity = DirectorIoC.getDirectorDao().findById(movieEntity.getDirectorId());
        Director director = DirectorMapper.toDirector(directorEntity);
        // System.out.println("\u001B[32m" + directorEntity + "\u001B[0m");

        // Asigna el director a la película.
        movie.setDirector(director);

        // Busca el listado de personajes y los mapea a un objeto Character.
        List<CharacterMovieEntity> charactersMovieEntity = CharacterMovieIoC.getCharacterMovieDao().findAll();
        List<CharacterMovie> charactersMovie = CharacterMovieMapper.toCharacterMovieList(charactersMovieEntity);

        // Busca el listado de actores y los mapea a un objeto Actor.
        List<ActorEntity> actorsEntity = ActorIoC.getActorDao().findById(); // Me falta el ID
        List<Actor> actores = ActorMapper.toActorList(actorsEntity);

        // Asigna los actores a la characters.
        charactersMovie.setActors(actores);

        // Asigna los actores a la película.
        movie.setCharacters(charactersMovie);

        return movie;
    }
}