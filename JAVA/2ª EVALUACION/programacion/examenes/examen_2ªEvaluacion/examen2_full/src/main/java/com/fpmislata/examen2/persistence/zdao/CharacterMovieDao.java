package com.fpmislata.examen2.persistence.zdao;

import java.util.List;

import com.fpmislata.examen2.persistence.zdao.entity.CharacterMovieEntity;

public interface CharacterMovieDao {

    List<CharacterMovieEntity> findAll();

    CharacterMovieEntity findById(Integer id);

    List<CharacterMovieEntity> findCharactersByMovieId(Integer id);
}
