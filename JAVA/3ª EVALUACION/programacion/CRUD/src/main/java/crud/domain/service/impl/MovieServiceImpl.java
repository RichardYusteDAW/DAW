package crud.domain.service.impl;

import java.util.List;

import crud.common.container.DirectorIoC;
import crud.domain.entity.Director;
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

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Integer id) {
        return movieRepository.findById(id);
    }

    @Override
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

    @Override
    public void delete(Integer id) {
        if (movieRepository.findById(id) != null)
            movieRepository.delete(id);
    }

    @Override
    public void update(Integer id, String title, Integer year, Integer directorId) {

        Director director = directorRepository.findById(directorId);
        if (director != null) {
            Movie movie = movieRepository.findById(id);

            if (!title.equals(""))
                movie.setTitle(title);

            if (year != null)
                movie.setYear(year);

            movie.setDirector(director);

            movieRepository.update(MovieMapper.toMovieEntity(movie));
        }
    }
}