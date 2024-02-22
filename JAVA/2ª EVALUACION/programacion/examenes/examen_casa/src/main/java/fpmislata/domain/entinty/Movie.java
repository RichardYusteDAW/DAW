package fpmislata.domain.entinty;

public class Movie {
    Integer id;
    String title;
    Director director;
    Integer year;

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

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Movie{" + "title=" + title + ", director=" + director + ", year=" + year + '}'
                + "\u001B[0m";
    }
}
