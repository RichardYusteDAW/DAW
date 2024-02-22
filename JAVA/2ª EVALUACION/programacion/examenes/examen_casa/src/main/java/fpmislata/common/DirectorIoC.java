package fpmislata.common;

import fpmislata.domain.service.DirectorService;
import fpmislata.domain.service.impl.DirectorServiceImpl;
import fpmislata.persistence.repository.DirectorRepository;
import fpmislata.persistence.repository.impl.DirectorRepositoryImpl;
import fpmislata.persistence.zdao.DirectorDao;
import fpmislata.persistence.zdao.impl.DirectorDaoImpl;

public class DirectorIoC {
    private static DirectorService directorService;
    private static DirectorRepository directorRepository;
    private static DirectorDao directorDao;

    public static DirectorService getDirectorService() {
        if (directorService == null) {
            directorService = new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }

    public static DirectorRepository getDirectorRepository() {
        if (directorRepository == null) {
            directorRepository = new DirectorRepositoryImpl(getDirectorDao());
        }
        return directorRepository;
    }

    public static DirectorDao getDirectorDao() {
        if (directorDao == null) {
            directorDao = new DirectorDaoImpl();
        }
        return directorDao;
    }
}
