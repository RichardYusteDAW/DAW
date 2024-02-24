package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;

public class DirectorIoC {

    private static DirectorDao directorDao;

    public static DirectorDao getDirectorDao() {
        if (directorDao == null) {
            directorDao = new DirectorDaoImpl();
        }
        return directorDao;
    }
}
