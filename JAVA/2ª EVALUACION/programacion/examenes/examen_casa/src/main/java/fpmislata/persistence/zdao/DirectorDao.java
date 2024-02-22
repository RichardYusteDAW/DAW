package fpmislata.persistence.zdao;

import java.util.List;

import fpmislata.persistence.zdao.entity.DirectorEntity;

public interface DirectorDao {
    List<DirectorEntity> findAll();

    DirectorEntity findById(int id);
}
