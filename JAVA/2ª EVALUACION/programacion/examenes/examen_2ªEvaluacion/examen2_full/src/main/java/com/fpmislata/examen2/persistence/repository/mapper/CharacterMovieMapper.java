package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.persistence.zdao.entity.CharacterMovieEntity;

public class CharacterMovieMapper {
    public static CharacterMovie toCharacterMovie(CharacterMovieEntity characterMovieEntity) {
        Integer id = characterMovieEntity.getId();
        String name = characterMovieEntity.getCharacterName();

        return new CharacterMovie(id, name);
    }
}