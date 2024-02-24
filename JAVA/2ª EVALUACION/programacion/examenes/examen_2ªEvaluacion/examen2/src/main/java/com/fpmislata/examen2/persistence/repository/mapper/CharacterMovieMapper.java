package com.fpmislata.examen2.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;

public class CharacterMovieMapper {
    public static CharacterMovie toCharacterMovie(CharacterMovieEntity characterMovieEntity) {
        Integer id = characterMovieEntity.getId();
        String name = characterMovieEntity.getCharacterName();

        return new CharacterMovie(id, name);
    }

    public static List<CharacterMovie> toCharacterMovieList(List<CharacterMovieEntity> characterMovieEntityList) {
        List<CharacterMovie> characterMovieList = new ArrayList<CharacterMovie>();

        for (CharacterMovieEntity characterMovieEntity : characterMovieEntityList) {
            characterMovieList.add(toCharacterMovie(characterMovieEntity));
        }

        return characterMovieList;
    }
}
