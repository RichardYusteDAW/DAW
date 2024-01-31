package examenIA2;

public class Item {
    protected String title, author;
    protected int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void showDetails() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear);
    }
}
