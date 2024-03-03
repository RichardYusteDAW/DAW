package crud.persistence.repository;

import java.util.List;

import crud.domain.entity.Director;

public interface DirectorRepository {

    Director findById(Integer id);

    List<Director> findAll();
}
