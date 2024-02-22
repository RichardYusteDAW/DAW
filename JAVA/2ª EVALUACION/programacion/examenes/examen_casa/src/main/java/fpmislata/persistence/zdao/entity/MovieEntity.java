package fpmislata.persistence.zdao.entity;

public class MovieEntity {
    private Integer id;
    private String title;
    private Integer year;
    private Integer idDirector;

    public MovieEntity(Integer id, String title, Integer year, Integer idDirector) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.idDirector = idDirector;
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

    public Integer getIdDirector() {
        return this.idDirector;
    }

    public void setIdDirector(Integer idDirector) {
        this.idDirector = idDirector;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Movie{" + "title=" + title + ", year=" + year + ", director=" + idDirector + '}'
                + "\u001B[0m";
    }
}
