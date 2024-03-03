package crud.persistence.zdao;

import java.util.List;

import crud.persistence.zdao.entity.DirectorEntity;

public interface DirectorDao {

    List<DirectorEntity> findAll();

    DirectorEntity findById(Integer id);
}
