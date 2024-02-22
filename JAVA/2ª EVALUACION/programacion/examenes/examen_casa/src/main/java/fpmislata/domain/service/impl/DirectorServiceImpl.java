package fpmislata.domain.service.impl;

import java.util.List;

import fpmislata.domain.entinty.Director;
import fpmislata.domain.service.DirectorService;
import fpmislata.persistence.repository.DirectorRepository;

public class DirectorServiceImpl implements DirectorService {

    DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> findAll() {
        return directorRepository.findAll();
    }

    public Director findById(Integer id) {
        return directorRepository.findById(id);
    }

}
