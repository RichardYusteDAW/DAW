package crud.persistence.repository;

import java.util.List;

import crud.domain.entity.Movie;
import crud.persistence.zdao.entity.MovieEntity;

public interface MovieRepository {

    List<Movie> findAll();

    Movie findById(Integer id);

    void add(MovieEntity movieEntity);

    void delete(Integer id);

    void update(MovieEntity movieEntity);
}
