package fpmislata.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;

import fpmislata.common.DirectorIoC;
import fpmislata.domain.entinty.Director;
import fpmislata.domain.entinty.Movie;
import fpmislata.persistence.repository.MovieRepository;
import fpmislata.persistence.repository.mapper.DirectorMapper;
import fpmislata.persistence.repository.mapper.MovieMapper;
import fpmislata.persistence.zdao.MovieDao;
import fpmislata.persistence.zdao.entity.DirectorEntity;
import fpmislata.persistence.zdao.entity.MovieEntity;

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
        DirectorEntity directorEntity = DirectorIoC.getDirectorDao().findById(movieEntity.getIdDirector());
        Director director = DirectorMapper.toDirector(directorEntity);

        // Asigna el director a la película.
        movie.setDirector(director);

        return movie;
    }
}