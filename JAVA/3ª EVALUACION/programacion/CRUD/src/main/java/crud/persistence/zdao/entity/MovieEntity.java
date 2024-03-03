package crud.persistence.zdao.entity;

public class MovieEntity {

    private int id;
    private String title;
    private int year;
    private int directorId;

    public MovieEntity(int id, String title, int year, int directorId) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.directorId = directorId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDirectorId() {
        return this.directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    @Override
    public String toString() {
        return "MovieEntity [id=" + id + ", title=" + title + ", year=" + year + ", directorId=" + directorId + "]";
    }

}
