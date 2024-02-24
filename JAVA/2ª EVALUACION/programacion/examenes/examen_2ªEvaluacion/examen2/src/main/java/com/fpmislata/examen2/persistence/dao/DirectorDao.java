package com.fpmislata.examen2.persistence.dao;

import java.util.List;

import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;

public interface DirectorDao {

    List<DirectorEntity> findAll();

    DirectorEntity findById(int id);
}
