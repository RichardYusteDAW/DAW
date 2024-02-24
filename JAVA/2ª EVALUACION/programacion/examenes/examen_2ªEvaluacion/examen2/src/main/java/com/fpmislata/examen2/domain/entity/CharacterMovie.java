package com.fpmislata.examen2.domain.entity;

public class CharacterMovie {
    private Integer id;
    private String name;
    private Actor actor;

    public CharacterMovie(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "CharacterMovie [id=" + id + ", name=" + name + "]";
    }
}
