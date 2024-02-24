package com.fpmislata.examen2.persistence.zdao;

import java.util.List;

import com.fpmislata.examen2.persistence.zdao.entity.DirectorEntity;

public interface DirectorDao {

    List<DirectorEntity> findAll();

    DirectorEntity findById(Integer id);
}
