package crud.domain.service;

import java.util.List;

import crud.domain.entity.Director;

public interface DirectorService {

    public Director findById(Integer id);

    public List<Director> findAll();

}