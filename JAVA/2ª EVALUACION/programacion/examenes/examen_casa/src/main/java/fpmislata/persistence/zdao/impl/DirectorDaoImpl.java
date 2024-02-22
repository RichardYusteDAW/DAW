package fpmislata.persistence.zdao.impl;

import java.util.ArrayList;
import java.util.List;

import fpmislata.persistence.zdao.DirectorDao;
import fpmislata.persistence.zdao.entity.DirectorEntity;

public class DirectorDaoImpl implements DirectorDao {

    List<DirectorEntity> directorEntityList = new ArrayList<>(List.of(
            new DirectorEntity(1, "Steven", "Spielberg"),
            new DirectorEntity(2, "Martin", "Scorsese"),
            new DirectorEntity(3, "Alfred", "Hitchcock")));

    public List<DirectorEntity> findAll() {
        return directorEntityList;
    }

    public DirectorEntity findById(int id) {
        for (DirectorEntity directorEntity : directorEntityList) {
            if (directorEntity.getId() == id) {
                return directorEntity;
            }
        }
        return null;
    }
}