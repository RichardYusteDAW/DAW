package com.fpmislata.examen2.persistence.repository.mapper;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.persistence.zdao.entity.DirectorEntity;

public class DirectorMapper {
    public static Director toDirector(DirectorEntity directorEntity) {
        Integer id = directorEntity.getId();
        String name = directorEntity.getName();

        return new Director(id, name);
    }

    public static DirectorEntity toDirectorEntity(Director director) {
        Integer id = director.getId();
        String name = director.getName();

        return new DirectorEntity(id, name);
    }
}