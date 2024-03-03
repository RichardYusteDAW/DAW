package crud.persistence.zdao;

import java.util.List;

import crud.persistence.zdao.entity.CharacterMovieEntity;

public interface CharacterMovieDao {

    List<CharacterMovieEntity> findAll();

    CharacterMovieEntity findById(Integer id);

    List<CharacterMovieEntity> findCharactersByMovieId(Integer id);
}
