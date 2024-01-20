package fpmislata.domain.entinty;

public enum BookEnum {
    BOOK1(1, "El nombre de la rosa", "Umberto Eco"),
    BOOK2(2, "La insoportable levedad del ser", "Milan Kundera"),
    BOOK3(3, "1Q84", "Haruki Murakami");

    private int id;
    private String title;
    private String author;

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
