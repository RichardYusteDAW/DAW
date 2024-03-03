package crud.common.container;

import crud.persistence.zdao.CharacterMovieDao;
import crud.persistence.zdao.impl.CharacterMovieDaoImpl;

public class CharacterMovieIoC {

    private static CharacterMovieDao characterMovieDao;

    public static CharacterMovieDao getCharacterMovieDao() {
        if (characterMovieDao == null) {
            characterMovieDao = new CharacterMovieDaoImpl();
        }
        return characterMovieDao;
    }
}