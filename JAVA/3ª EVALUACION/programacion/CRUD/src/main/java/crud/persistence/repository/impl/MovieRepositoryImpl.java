package crud.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;

import crud.common.container.ActorIoC;
import crud.common.container.CharacterMovieIoC;
import crud.common.container.DirectorIoC;
import crud.common.container.MovieIoC;
import crud.domain.entity.Actor;
import crud.domain.entity.CharacterMovie;
import crud.domain.entity.Director;
import crud.domain.entity.Movie;
import crud.persistence.repository.MovieRepository;
import crud.persistence.repository.mapper.ActorMapper;
import crud.persistence.repository.mapper.CharacterMovieMapper;
import crud.persistence.repository.mapper.DirectorMapper;
import crud.persistence.repository.mapper.MovieMapper;
import crud.persistence.zdao.MovieDao;
import crud.persistence.zdao.entity.ActorEntity;
import crud.persistence.zdao.entity.CharacterMovieEntity;
import crud.persistence.zdao.entity.DirectorEntity;
import crud.persistence.zdao.entity.MovieEntity;

public class MovieRepositoryImpl implements MovieRepository {

    MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> findAll() {

        // Busca todas las películas y las mappea a una lista de objetos Movie.
        List<MovieEntity> movieEntityList = MovieIoC.getMovieDao().findAll();

        List<Movie> movieList = MovieMapper.toMovieList(movieEntityList);

        return movieList;
    }

    public Movie findById(Integer id) {

        // Busca la MovieEntity y la mappea a un objeto Movie.
        MovieEntity movieEntity = movieDao.findById(id);
        Movie movie = MovieMapper.toMovie(movieEntity);

        // Busca el DirecorEntity de MovieEntity y lo mappea a un objeto Director.
        DirectorEntity directorEntity = DirectorIoC.getDirectorDao().findById(movieEntity.getDirectorId());
        Director director = DirectorMapper.toDirector(directorEntity);

        // Setea el Director de Movie.
        movie.setDirector(director);

        // Busca el listado de CharactersEntity de esa MovieEntity en concreto.
        List<CharacterMovieEntity> charactersMovieEntity = CharacterMovieIoC.getCharacterMovieDao()
                .findCharactersByMovieId(id);
        // Se crea una lista de Characters:
        List<CharacterMovie> charactersMovie = new ArrayList<CharacterMovie>();

        // Busca el ActorEntity que coincide con ese Character y lo mapea a un objetoActor.
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

    public void add(MovieEntity movieEntity) {
        movieDao.add(movieEntity);
    }

    public void delete(Integer id) {
        movieDao.delete(id);
    }

    public void update(MovieEntity movieEntity) {
        movieDao.update(movieEntity);
    }
}