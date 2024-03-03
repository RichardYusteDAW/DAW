package crud.persistence.repository.mapper;

import crud.domain.entity.Actor;
import crud.persistence.zdao.entity.ActorEntity;

public class ActorMapper {

    public static Actor toActor(ActorEntity actorEntity) {
        Integer id = actorEntity.getId();
        String name = actorEntity.getName();

        return new Actor(id, name);
    }

    public static ActorEntity toActorEntity(Actor actor) {
        Integer id = actor.getId();
        String name = actor.getName();

        return new ActorEntity(id, name);
    }
}