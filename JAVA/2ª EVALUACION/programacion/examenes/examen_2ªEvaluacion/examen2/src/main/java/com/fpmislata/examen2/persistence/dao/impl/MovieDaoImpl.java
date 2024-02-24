package com.fpmislata.examen2.persistence.dao.impl;

import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private List<MovieEntity> movieEntityList = new ArrayList<>();

    public MovieDaoImpl() {
        this.movieEntityList.add(new MovieEntity(1, "El padrino", 1972, 1));
        this.movieEntityList.add(new MovieEntity(2, "Cadena perpetua", 1994, 2));
        this.movieEntityList.add(new MovieEntity(3, "La lista de Schindler", 1993, 3));
        this.movieEntityList.add(new MovieEntity(4, "Casablanca", 1942, 4));
        this.movieEntityList.add(new MovieEntity(5, "El padrino: Parte II", 1974, 1));
        this.movieEntityList.add(new MovieEntity(6, "El caballero oscuro", 2008, 5));
        this.movieEntityList.add(new MovieEntity(7, "El nombre de la rosa", 1986, 6));
        this.movieEntityList.add(new MovieEntity(8, "El club de la lucha", 1999, 7));
        this.movieEntityList.add(new MovieEntity(9, "En busca del arca perdida", 1981, 3));
        this.movieEntityList.add(new MovieEntity(10, "Indiana Jones y la última cruzada", 1989, 3));

    }

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
