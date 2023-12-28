package examenIA4;

public class Item {
    private String colorVerde = "\u001B[32m";
    private String resetColor = "\u001B[0m";

    protected String title, author;
    protected int yearPublished;

    public Item(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void showDetails() {
        System.out.println(colorVerde + "├── " + resetColor + "Title: " + title);
        System.out.println(colorVerde + "├── " + resetColor + "Author: " + author);
        System.out.println(colorVerde + "├── " + resetColor + "Year published: " + yearPublished);
    }
}
