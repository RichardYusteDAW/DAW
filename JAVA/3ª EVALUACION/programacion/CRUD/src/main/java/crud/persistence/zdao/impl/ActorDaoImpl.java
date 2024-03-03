package crud.persistence.zdao.impl;

import java.util.ArrayList;
import java.util.List;

import crud.common.container.CharacterMovieIoC;
import crud.persistence.zdao.ActorDao;
import crud.persistence.zdao.entity.ActorEntity;
import crud.persistence.zdao.entity.CharacterMovieEntity;

public class ActorDaoImpl implements ActorDao {

    private List<ActorEntity> actorEntityList = List.of(
            new ActorEntity(1, "Marlon Brando"),
            new ActorEntity(2, "Al Pacino"),
            new ActorEntity(3, "James Caan"),
            new ActorEntity(4, "Tim Robbins"),
            new ActorEntity(5, "Morgan Freeman"),
            new ActorEntity(6, "Bob Gunton"),
            new ActorEntity(7, "Liam Neeson"),
            new ActorEntity(8, "Ben Kingsley"),
            new ActorEntity(9, "Ralph Fiennes"),
            new ActorEntity(10, "Humphrey Bogart"),
            new ActorEntity(11, "Ingrid Bergman"),
            new ActorEntity(12, "Paul Henreid"),
            new ActorEntity(13, "Robert De niro"),
            new ActorEntity(14, "Christian Bale"),
            new ActorEntity(15, "Heath Ledger"),
            new ActorEntity(16, "Gary Oldman"),
            new ActorEntity(17, "Sean Connery"),
            new ActorEntity(18, "Christian Slater"),
            new ActorEntity(19, "F. Murray Abraham"),
            new ActorEntity(20, "Brad Pitt"),
            new ActorEntity(21, "Edward Norton"),
            new ActorEntity(22, "Helena Bonham Carter"),
            new ActorEntity(23, "Harrison Ford"),
            new ActorEntity(24, "Karen Allen"),
            new ActorEntity(25, "John Rhys-Davies"),
            new ActorEntity(26, "Alison Doody"));

    public List<ActorEntity> findAll() {
        return actorEntityList;
    }

    public ActorEntity findById(Integer id) {
        for (ActorEntity actorEntity : actorEntityList) {
            if (actorEntity.getId() == id) {
                return actorEntity;
            }
        }
        return null;
    }

    public List<ActorEntity> findByMovieId(Integer id) {
        List<CharacterMovieEntity> characterMovieEntityList = CharacterMovieIoC.getCharacterMovieDao().findAll();
        List<ActorEntity> actors = new ArrayList<>();

        for (CharacterMovieEntity characterMovieEntity : characterMovieEntityList) {
            actors.add(findById(characterMovieEntity.getActorId()));
        }
        return actors;
    }
}