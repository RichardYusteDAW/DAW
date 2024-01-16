package ejercicios.Unidad9_Herencia_y_composicion.ejercicio1;

public class Clothes extends Product {
    public Clothes(int id, float price) {
        super(id, price);
    }

    @Override
    public String toString() {
        return "Clothes{" + super.toString() + "}";
    }
}