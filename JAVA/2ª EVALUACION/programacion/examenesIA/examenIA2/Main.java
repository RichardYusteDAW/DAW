package examenIA2;

public class Main {
    public static void main(String[] args) {
        // Library library = new Library(null);

        // library.addItem(new Book("El Señor de los Anillos", "J.R.R. Tolkien", 1954,
        // 1178, "Fantasía"));
        // library.addItem(new Film("Inception", "Christopher Nolan", 2010, 148,
        // "Christopher Nolan"));
        // library.addItem(new DiscMusic("Thriller", "Michael Jackson", 1982, "Pop",
        // 9));

        // library.showItems();

        Item book = new Book("El señor de los anillos", "J.R.R. Tolkien", 1954, 1178, "Fantasía");
        Item film = new Film("Inception", "Christopher Nolan", 2010, 148, "Christopher Nolan");
        Item song = new DiscMusic("Thriller", "Michael Jackson", 1982, "Pop", 9);

        Library library = new Library();

        library.addItem(book);
        library.addItem(film);
        library.addItem(song);

        library.showItems();
    }
}
