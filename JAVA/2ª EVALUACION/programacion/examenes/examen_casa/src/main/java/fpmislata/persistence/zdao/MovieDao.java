package fpmislata.persistence.zdao;

import java.util.List;

import fpmislata.persistence.zdao.entity.MovieEntity;

public interface MovieDao {
    List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
