package com.fpmislata.examen2.persistence.zdao.impl;

import java.util.List;

import com.fpmislata.examen2.persistence.zdao.DirectorDao;
import com.fpmislata.examen2.persistence.zdao.entity.DirectorEntity;

public class DirectorDaoImpl implements DirectorDao {

    List<DirectorEntity> directorEntityList = List.of(
            new DirectorEntity(1, "Francis Ford Coppola"),
            new DirectorEntity(2, "Frank Darabont"),
            new DirectorEntity(3, "Steven Spielberg"),
            new DirectorEntity(4, "Michael Curtiz"),
            new DirectorEntity(5, "Christopher Nolan"),
            new DirectorEntity(6, "Jean Jaques Annaud"),
            new DirectorEntity(7, "David Fincher"));

    public List<DirectorEntity> findAll() {
        return directorEntityList;
    }

    public DirectorEntity findById(Integer id) {
        for (DirectorEntity directorEntity : directorEntityList) {
            if (directorEntity.getId() == id) {
                return directorEntity;
            }
        }
        return null;
    }
}
