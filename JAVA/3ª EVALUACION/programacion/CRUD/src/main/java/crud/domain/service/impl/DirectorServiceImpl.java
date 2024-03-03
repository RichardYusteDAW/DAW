package crud.domain.service.impl;

import java.util.List;

import crud.domain.entity.Director;
import crud.domain.service.DirectorService;
import crud.persistence.repository.DirectorRepository;

public class DirectorServiceImpl implements DirectorService {

    DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public Director findById(Integer id) {
        return directorRepository.findById(id);
    }

    @Override
    public List<Director> findAll() {
        return directorRepository.findAll();
    }

}