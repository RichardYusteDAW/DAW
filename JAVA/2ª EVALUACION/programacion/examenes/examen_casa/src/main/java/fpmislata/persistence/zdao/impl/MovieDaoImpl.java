package fpmislata.persistence.zdao.impl;

import java.util.ArrayList;
import java.util.List;

import fpmislata.persistence.zdao.MovieDao;
import fpmislata.persistence.zdao.entity.MovieEntity;

public class MovieDaoImpl implements MovieDao {

    List<MovieEntity> movieEntityList = new ArrayList<MovieEntity>(List.of(
            new MovieEntity(1, "The Godfather", 1972, 1),
            new MovieEntity(2, "The Shawshank Redemption", 1994, 2),
            new MovieEntity(3, "Schindler's List", 1993, 3),
            new MovieEntity(4, "Raging Bull", 1980, 1),
            new MovieEntity(5, "Casablanca", 1942, 2),
            new MovieEntity(6, "Citizen Kane", 1941, 3),
            new MovieEntity(7, "Gone with the Wind", 1939, 1),
            new MovieEntity(8, "The Wizard of Oz", 1939, 2),
            new MovieEntity(9, "One Flew Over the Cuckoo's Nest", 1975, 3),
            new MovieEntity(10, "Lawrence of Arabia", 1962, 1)));

    public List<MovieEntity> findAll() {
        return movieEntityList;
    }

    public MovieEntity findById(int id) {
        for (MovieEntity movieEntity : movieEntityList) {
            if (movieEntity.getId() == id) {
                return movieEntity;
            }
        }
        return null;
    }
}