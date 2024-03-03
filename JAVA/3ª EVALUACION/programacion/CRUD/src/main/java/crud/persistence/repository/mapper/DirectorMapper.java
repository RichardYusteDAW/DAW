package crud.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import crud.domain.entity.Director;
import crud.persistence.zdao.entity.DirectorEntity;

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
        List<Director> directorlList = new ArrayList<>();

        for (DirectorEntity directorEntity : directorEntityList) {
            directorlList.add(toDirector(directorEntity));
        }

        return directorlList;
    }
}