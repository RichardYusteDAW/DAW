package ejercicios.Unidad9_Herencia_y_composicion.ejercicio5;

public class Books extends Product {
    private String author, title;
    private final float DISCOUNT = 0.8f;

    public Books(int id, float price, String author, String title) {
        super(id, price);

        this.author = author;
        this.title = title;
    }

    @Override
    public float getPrice() {
        return super.getPrice() * DISCOUNT;
    }

    @Override
    public String toString() {
        return String.format("Books{id=%s, price=%s, author='%s',title='%s'}", id, getPrice(), author, title);
    }
}