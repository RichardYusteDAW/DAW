package com.fpmislata.examen2.domain.entity;

import java.util.List;

public class Movie {

    Integer id;
    String title;
    Integer year;
    Director director;
    List<CharacterMovie> characterMovieList;

    public Movie(Integer id, String title, Integer year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<CharacterMovie> getCharacterMovieList() {
        return this.characterMovieList;
    }

    public void setCharacterMovieList(List<CharacterMovie> characterMovieList) {
        this.characterMovieList = characterMovieList;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", director=" + director + ", Characters="
                + characterMovieList + "]";
    }
}