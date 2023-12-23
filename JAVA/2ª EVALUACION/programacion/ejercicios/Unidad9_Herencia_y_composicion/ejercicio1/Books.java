package ejercicios.Unidad9_Herencia_y_composicion.ejercicio1;

public class Books extends Product {
    public Books(int id, float price) {
        super(id, price);
    }

    @Override
    public String toString() {
        return "Books{" + super.toString() + "}";
    }
}