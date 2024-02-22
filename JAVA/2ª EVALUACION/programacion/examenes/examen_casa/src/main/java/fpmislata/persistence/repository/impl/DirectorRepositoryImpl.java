package fpmislata.persistence.repository.impl;

import java.util.List;

import fpmislata.domain.entinty.Director;
import fpmislata.persistence.repository.DirectorRepository;
import fpmislata.persistence.repository.mapper.DirectorMapper;
import fpmislata.persistence.zdao.DirectorDao;

public class DirectorRepositoryImpl implements DirectorRepository {

    DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    public List<Director> findAll() {
        return DirectorMapper.toDirectorList(directorDao.findAll());
    }

    public Director findById(Integer id) {
        return DirectorMapper.toDirector(directorDao.findById(id));
    }
}
