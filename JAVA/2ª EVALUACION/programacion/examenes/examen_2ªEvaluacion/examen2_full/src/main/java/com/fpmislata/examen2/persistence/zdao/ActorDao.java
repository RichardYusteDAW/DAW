package com.fpmislata.examen2.persistence.zdao;

import java.util.List;

import com.fpmislata.examen2.persistence.zdao.entity.ActorEntity;

public interface ActorDao {

    List<ActorEntity> findAll();

    ActorEntity findById(Integer id);
}
