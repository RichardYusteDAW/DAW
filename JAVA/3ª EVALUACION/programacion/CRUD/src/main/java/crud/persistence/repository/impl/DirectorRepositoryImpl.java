package crud.persistence.repository.impl;

import java.util.List;

import crud.domain.entity.Director;
import crud.persistence.repository.DirectorRepository;
import crud.persistence.repository.mapper.DirectorMapper;
import crud.persistence.zdao.DirectorDao;

public class DirectorRepositoryImpl implements DirectorRepository {

    DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Override
    public Director findById(Integer id) {
        return DirectorMapper.toDirector(directorDao.findById(id));
    }

    @Override
    public List<Director> findAll() {
        return DirectorMapper.toDirectorList(directorDao.findAll());
    }

}
