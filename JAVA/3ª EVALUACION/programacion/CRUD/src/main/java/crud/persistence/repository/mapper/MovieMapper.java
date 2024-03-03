package crud.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import crud.domain.entity.Movie;
import crud.persistence.zdao.entity.MovieEntity;

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

    public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {

        List<Movie> MovieList = new ArrayList<>();

        for (MovieEntity movieEntity : movieEntityList) {
            MovieList.add(toMovie(movieEntity));
        }

        return MovieList;
    }

}
