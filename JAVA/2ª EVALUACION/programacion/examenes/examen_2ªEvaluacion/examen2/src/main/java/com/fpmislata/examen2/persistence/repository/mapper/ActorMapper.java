package com.fpmislata.examen2.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examen2.domain.entity.Actor;
import com.fpmislata.examen2.persistence.dao.entity.ActorEntity;

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

    public static List<Actor> toActorList(List<ActorEntity> actorEntityList) {
        List<Actor> actorList = new ArrayList<Actor>();

        for (ActorEntity actorEntity : actorEntityList) {
            actorList.add(toActor(actorEntity));
        }

        return actorList;
    }
}