package fpmislata.domain.entinty;

public enum BookEnum {
    LIBRO1(1, "Libro 1", "Autor 1"),
    LIBRO2(2, "Libro 2", "Autor 2"),
    LIBRO3(3, "Libro 3", "Autor 3");

    private final int id;
    private final String title;
    private final String author;

    private BookEnum(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
