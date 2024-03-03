package crud.common.container;

import crud.domain.service.DirectorService;
import crud.domain.service.impl.DirectorServiceImpl;
import crud.persistence.repository.DirectorRepository;
import crud.persistence.repository.impl.DirectorRepositoryImpl;
import crud.persistence.zdao.DirectorDao;
import crud.persistence.zdao.impl.DirectorDaoImpl;

public class DirectorIoC {

    private static DirectorService directorService;
    private static DirectorRepository directorRepository;
    private static DirectorDao directorDao;

    public static DirectorService getDirectorService() {
        if (directorService == null)
            directorService = new DirectorServiceImpl(getDirectorRepository());

        return directorService;
    }

    public static DirectorRepository getDirectorRepository() {
        if (directorRepository == null)
            directorRepository = new DirectorRepositoryImpl(getDirectorDao());

        return directorRepository;
    }

    public static DirectorDao getDirectorDao() {
        if (directorDao == null)
            directorDao = new DirectorDaoImpl();

        return directorDao;
    }
}