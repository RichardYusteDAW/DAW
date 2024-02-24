package com.fpmislata.examen2.persistence.dao;

import java.util.List;

import com.fpmislata.examen2.persistence.dao.entity.ActorEntity;

public interface ActorDao {

    List<ActorEntity> findAll();

    ActorEntity findById(int id);
}
