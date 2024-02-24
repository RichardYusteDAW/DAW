package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.persistence.zdao.ActorDao;
import com.fpmislata.examen2.persistence.zdao.impl.ActorDaoImpl;

public class ActorIoC {
    private static ActorDao actorDao;

    public static ActorDao getActorDao() {
        if (actorDao == null) {
            actorDao = new ActorDaoImpl();
        }
        return actorDao;
    }
}
