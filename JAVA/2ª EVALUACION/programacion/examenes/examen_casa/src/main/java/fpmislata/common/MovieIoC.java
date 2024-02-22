package fpmislata.common;

import fpmislata.domain.service.MovieService;
import fpmislata.domain.service.impl.MovieServiceImpl;
import fpmislata.persistence.repository.MovieRepository;
import fpmislata.persistence.repository.impl.MovieRepositoryImpl;
import fpmislata.persistence.zdao.MovieDao;
import fpmislata.persistence.zdao.impl.MovieDaoImpl;

public class MovieIoC {
    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static MovieDao movieDao;

    public static MovieService getMovieService() {
        if (movieService == null) {
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }

    public static MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            movieRepository = new MovieRepositoryImpl(getMovieDao());
        }
        return movieRepository;
    }

    public static MovieDao getMovieDao() {
        if (movieDao == null) {
            movieDao = new MovieDaoImpl();
        }
        return movieDao;
    }

}
