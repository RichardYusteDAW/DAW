package com.fpmislata.examen2.persistence.zdao;

import java.util.List;

import com.fpmislata.examen2.persistence.zdao.entity.MovieEntity;

public interface MovieDao {

    List<MovieEntity> findAll();

    MovieEntity findById(Integer id);
}
