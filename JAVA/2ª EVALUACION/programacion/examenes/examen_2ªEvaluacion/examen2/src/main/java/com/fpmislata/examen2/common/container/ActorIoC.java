package com.fpmislata.examen2.common.container;

import com.fpmislata.examen2.persistence.dao.ActorDao;
import com.fpmislata.examen2.persistence.dao.impl.ActorDaoImpl;

public class ActorIoC {
    private static ActorDao actorDao;

    public static ActorDao getActorDao() {
        if (actorDao == null) {
            actorDao = new ActorDaoImpl();
        }
        return actorDao;
    }
}
