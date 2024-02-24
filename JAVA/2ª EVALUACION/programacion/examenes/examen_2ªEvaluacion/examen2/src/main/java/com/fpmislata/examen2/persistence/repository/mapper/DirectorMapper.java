package com.fpmislata.examen2.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

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

    public static List<Director> toDirectorList(List<DirectorEntity> directorEntityList) {
        List<Director> directorList = new ArrayList<Director>();

        for (DirectorEntity directorEntity : directorEntityList) {
            directorList.add(toDirector(directorEntity));
        }

        return directorList;
    }
}