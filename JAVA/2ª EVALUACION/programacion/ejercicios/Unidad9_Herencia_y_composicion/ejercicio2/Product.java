/*
Añade los atributos type, size y colour a la clase Clothes, y author y title a la clase Books. 
Haz que los constructores de ambas clases reciban como parámetros todos los atributos 
(los de la clase padre y los suyos propios). 
*/
package ejercicios.Unidad9_Herencia_y_composicion.ejercicio2;

public class Product {
    protected int id;
    protected float price;

    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}