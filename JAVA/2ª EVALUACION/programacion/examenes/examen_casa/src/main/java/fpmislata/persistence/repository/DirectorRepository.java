package fpmislata.persistence.repository;

import java.util.List;

import fpmislata.domain.entinty.Director;

public interface DirectorRepository {

    List<Director> findAll();

    Director findById(Integer id);
}
