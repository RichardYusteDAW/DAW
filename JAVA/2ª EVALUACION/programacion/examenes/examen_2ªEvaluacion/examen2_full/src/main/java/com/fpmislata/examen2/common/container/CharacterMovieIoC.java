package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.persistence.zdao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.zdao.impl.CharacterMovieDaoImpl;

public class CharacterMovieIoC {
    private static CharacterMovieDao characterMovieDao;

    public static CharacterMovieDao getCharacterMovieDao() {
        if (characterMovieDao == null) {
            characterMovieDao = new CharacterMovieDaoImpl();
        }
        return characterMovieDao;
    }
}
