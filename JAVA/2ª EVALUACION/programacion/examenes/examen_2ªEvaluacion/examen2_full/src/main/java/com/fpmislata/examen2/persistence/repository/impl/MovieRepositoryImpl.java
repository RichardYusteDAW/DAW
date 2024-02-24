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
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.ActorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;
import com.fpmislata.examen2.persistence.zdao.MovieDao;
import com.fpmislata.examen2.persistence.zdao.entity.ActorEntity;
import com.fpmislata.examen2.persistence.zdao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.zdao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.zdao.entity.MovieEntity;

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
        /* PRIMERA PARTE */
        // Busca la MovieEntity y la mappea a un objeto Movie.
        MovieEntity movieEntity = movieDao.findById(id);
        Movie movie = MovieMapper.toMovie(movieEntity);

        // Busca el DirecorEntity de MovieEntity y lo mappea a un objeto Director.
        DirectorEntity directorEntity = DirectorIoC.getDirectorDao().findById(movieEntity.getDirectorId());
        Director director = DirectorMapper.toDirector(directorEntity);

        // Setea el Director de Movie.
        movie.setDirector(director);
        /*
         * 
         * 
         * 
         * 
         * 
         */
        /* SEGUNDA PARTE */
        // Busca el listado de CharactersEntity de esa MovieEntity en concreto.
        List<CharacterMovieEntity> charactersMovieEntity = CharacterMovieIoC.getCharacterMovieDao()
                .findCharactersByMovieId(id);
        // Se crea una lista de Characters:
        List<CharacterMovie> charactersMovie = new ArrayList<CharacterMovie>();

        // Busca el ActorEntity que coincide con ese Character y lo mapea a un
        // objetoActor.
        for (CharacterMovieEntity characterMovieEntity : charactersMovieEntity) {
            ActorEntity actorEntity = ActorIoC.getActorDao().findById(characterMovieEntity.getActorId());
            Actor actor = ActorMapper.toActor(actorEntity);

            // Mapea el Character y añade ese Actor
            CharacterMovie characterMovie = CharacterMovieMapper.toCharacterMovie(characterMovieEntity);
            characterMovie.setActor(actor);

            // Añade CharacterMovie a la lista de CharactersMovie.
            charactersMovie.add(characterMovie);
        }

        // Asigna los Characters a Movie.
        movie.setCharacterMovieList(charactersMovie);

        return movie;
    }
}