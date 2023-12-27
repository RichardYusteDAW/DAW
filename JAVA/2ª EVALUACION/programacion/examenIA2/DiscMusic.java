package examenIA2;

public class DiscMusic extends Item {
    private String genre;
    private int songsNumber;

    public DiscMusic(String title, String author, int publicationYear, String genre, int songsNumber) {
        super(title, author, publicationYear);
        this.genre = genre;
        this.songsNumber = songsNumber;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Genre: " + genre);
        System.out.println("Songs Number: " + songsNumber);
    }
}
