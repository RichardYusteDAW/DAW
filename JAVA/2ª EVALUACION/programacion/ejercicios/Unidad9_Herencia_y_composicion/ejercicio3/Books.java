package ejercicios.Unidad9_Herencia_y_composicion.ejercicio3;

public class Books extends Product {
    private String author, title;

    public Books(int id, float price, String author, String title) {
        super(id, price);

        this.author = author;
        this.title = title;
    }
}