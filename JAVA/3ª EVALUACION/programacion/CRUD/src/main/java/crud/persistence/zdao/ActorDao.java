package crud.persistence.zdao;

import java.util.List;

import crud.persistence.zdao.entity.ActorEntity;

public interface ActorDao {

    List<ActorEntity> findAll();

    ActorEntity findById(Integer id);
}
