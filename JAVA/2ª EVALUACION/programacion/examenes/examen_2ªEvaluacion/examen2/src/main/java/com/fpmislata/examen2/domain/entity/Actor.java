package com.fpmislata.examen2.domain.entity;

public class Actor {
    private Integer id;
    private String name;

    public Actor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setIdr(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", name=" + name + "]";
    }

}
