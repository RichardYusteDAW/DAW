package com.fpmislata.examen2.persistence.dao;

import java.util.List;

import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;

public interface CharacterMovieDao {

    List<CharacterMovieEntity> findAll();

    CharacterMovieEntity findById(int id);

}
