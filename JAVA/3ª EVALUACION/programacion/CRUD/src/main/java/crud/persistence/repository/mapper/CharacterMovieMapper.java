package crud.persistence.repository.mapper;

import crud.domain.entity.CharacterMovie;
import crud.persistence.zdao.entity.CharacterMovieEntity;

public class CharacterMovieMapper {

    public static CharacterMovie toCharacterMovie(CharacterMovieEntity characterMovieEntity) {
        Integer id = characterMovieEntity.getId();
        String name = characterMovieEntity.getCharacterName();

        return new CharacterMovie(id, name);
    }
}