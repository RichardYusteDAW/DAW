package examenIA2;

public class Film extends Item {
    private int duration;
    private String director;

    public Film(String title, String author, int publicationYear, int duration, String director) {
        super(title, author, publicationYear);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Duration: " + duration);
        System.out.println("Director: " + director);
    }
}
