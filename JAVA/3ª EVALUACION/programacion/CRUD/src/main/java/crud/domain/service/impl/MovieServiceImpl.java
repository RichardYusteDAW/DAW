package crud.domain.service.impl;

import java.util.List;

import crud.common.container.DirectorIoC;
import crud.domain.entity.Movie;
import crud.domain.service.MovieService;
import crud.persistence.repository.DirectorRepository;
import crud.persistence.repository.MovieRepository;
import crud.persistence.repository.mapper.MovieMapper;
import crud.persistence.zdao.entity.MovieEntity;

public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;
    DirectorRepository directorRepository = DirectorIoC.getDirectorRepository();

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(Integer id) {
        return movieRepository.findById(id);
    }

    public void add(String title, Integer year, Integer directorId) {
        if (directorRepository.findById(directorId) != null) {

            // Si el director existe (not null) creamos una película y le añadimos ese director:
            Movie movie = new Movie(11, title, year);
            movie.setDirector(directorRepository.findById(directorId));

            // Mapeamos de Movie a MovieEntity y se la pasamos al repo.
            MovieEntity movieEntity = MovieMapper.toMovieEntity(movie);
            movieRepository.add(movieEntity);
        }
    }
}