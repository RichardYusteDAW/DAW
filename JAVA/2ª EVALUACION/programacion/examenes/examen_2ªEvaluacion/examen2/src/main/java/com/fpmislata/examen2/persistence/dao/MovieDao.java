package com.fpmislata.examen2.persistence.dao;

import java.util.List;

import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

public interface MovieDao {

    List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
