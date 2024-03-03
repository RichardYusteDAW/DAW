package crud.persistence.zdao;

import java.util.List;

import crud.persistence.zdao.entity.MovieEntity;

public interface MovieDao {

    List<MovieEntity> findAll();

    MovieEntity findById(Integer id);

    void add(MovieEntity movieEntity);
}
