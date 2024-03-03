package crud.common.container;

import crud.persistence.zdao.ActorDao;
import crud.persistence.zdao.impl.ActorDaoImpl;

public class ActorIoC {

    private static ActorDao actorDao;

    public static ActorDao getActorDao() {
        if (actorDao == null) {
            actorDao = new ActorDaoImpl();
        }
        return actorDao;
    }
}