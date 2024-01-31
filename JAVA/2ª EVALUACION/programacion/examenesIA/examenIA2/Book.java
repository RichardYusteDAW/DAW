package examenIA2;

public class Book extends Item {
    private int pagesNumber;
    private String genre;

    public Book(String title, String author, int publicationYear, int pagesNumber, String genre) {
        super(title, author, publicationYear);
        this.pagesNumber = pagesNumber;
        this.genre = genre;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Pages Number: " + pagesNumber + "\nGenre: " + genre);
    }
}
