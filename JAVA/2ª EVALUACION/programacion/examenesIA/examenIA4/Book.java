package examenIA4;

public class Book extends Item {
    private String colorVerde = "\u001B[32m";
    private String resetColor = "\u001B[0m";

    private String ISBN;
    private int availableCopies;

    public Book(String title, String author, int yearPublished, String ISBN, int availableCopies) {
        super(title, author, yearPublished);
        this.ISBN = ISBN;
        this.availableCopies = availableCopies;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println(colorVerde + "├── " + resetColor + "ISBN: " + ISBN);
        System.out.println(colorVerde + "├── " + resetColor + "Available copies: " + availableCopies);
    }
}
