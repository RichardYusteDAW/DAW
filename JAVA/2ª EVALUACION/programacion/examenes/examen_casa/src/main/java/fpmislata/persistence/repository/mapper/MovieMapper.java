package fpmislata.persistence.repository.mapper;

import fpmislata.domain.entinty.Movie;
import fpmislata.persistence.zdao.entity.MovieEntity;

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

    // public static List<Movie> toMovieList(List<MovieEntity> movieEntityList) {
    // List<Movie> movieList = new ArrayList<Movie>();

    // // Es bucle mapea cada entidad a su correspondiente objeto de dominio y lo
    // añade
    // // a la lista de objetos de dominio.
    // for (MovieEntity movieEntity : movieEntityList) {
    // movieList.add(toMovie(movieEntity));
    // }

    // return movieList;
    // }
}