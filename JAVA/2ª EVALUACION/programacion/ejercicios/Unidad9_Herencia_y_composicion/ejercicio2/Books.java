package ejercicios.Unidad9_Herencia_y_composicion.ejercicio2;

public class Books extends Product {
    private String author, title;

    public Books(int id, float price, String author, String title) {
        super(id, price);

        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" + super.toString() +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}