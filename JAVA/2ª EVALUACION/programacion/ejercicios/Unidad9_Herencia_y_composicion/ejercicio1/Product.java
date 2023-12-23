/*
Crea la clase Product con los atributos id y price. 
Haz el constructor y los getters correspondientes, además del métodos toString(). 
Crea dos clases que hereden de Product: Clothes y Books. 
*/
package ejercicios.Unidad9_Herencia_y_composicion.ejercicio1;

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