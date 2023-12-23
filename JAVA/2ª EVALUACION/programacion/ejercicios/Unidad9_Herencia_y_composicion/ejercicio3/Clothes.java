package ejercicios.Unidad9_Herencia_y_composicion.ejercicio3;

public class Clothes extends Product {
    private String type, size, colour;

    public Clothes(int id, float price, String type, String size, String colour) {
        super(id, price);

        this.type = type;
        this.size = size;
        this.colour = colour;
    }
}