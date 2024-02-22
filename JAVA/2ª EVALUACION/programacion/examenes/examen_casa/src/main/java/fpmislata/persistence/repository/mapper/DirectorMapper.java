package fpmislata.persistence.repository.mapper;

import java.util.ArrayList;
import java.util.List;

import fpmislata.domain.entinty.Director;
import fpmislata.persistence.zdao.entity.DirectorEntity;

public class DirectorMapper {

    public static Director toDirector(DirectorEntity directorEntity) {
        Integer id = directorEntity.getId();
        String name = directorEntity.getName();
        String surname = directorEntity.getSurname();

        return new Director(id, name, surname);
    }

    public static DirectorEntity toDirectorEntity(Director director) {
        Integer id = director.getId();
        String name = director.getName();
        String surname = director.getSurname();

        return new DirectorEntity(id, name, surname);
    }

    public static List<Director> toDirectorList(List<DirectorEntity> directorEntityList) {
        List<Director> directorList = new ArrayList<Director>();

        // Es bucle mapea cada entidad a su correspondiente objeto de dominio y lo añade
        // a la lista de objetos de dominio.
        for (DirectorEntity directorEntity : directorEntityList) {
            directorList.add(toDirector(directorEntity));
        }

        return directorList;
    }
}