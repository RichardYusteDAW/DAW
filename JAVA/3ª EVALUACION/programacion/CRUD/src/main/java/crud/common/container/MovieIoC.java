package crud.common.container;

import crud.domain.service.MovieService;
import crud.domain.service.impl.MovieServiceImpl;
import crud.persistence.repository.MovieRepository;
import crud.persistence.repository.impl.MovieRepositoryImpl;
import crud.persistence.zdao.MovieDao;
import crud.persistence.zdao.impl.MovieDaoImpl;

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