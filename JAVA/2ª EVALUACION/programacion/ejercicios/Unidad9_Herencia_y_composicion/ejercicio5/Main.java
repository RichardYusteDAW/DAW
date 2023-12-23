/*
Crea una constante en la clase Book llamada DISCOUNT con valor 0.8. 
Haz que el método getPrice() de esa clase devuelva el precio aplicándole el descuento correspondiente.
*/
package ejercicios.Unidad9_Herencia_y_composicion.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, 10);
        System.out.println(product1);

        Books book1 = new Books(1, 10, "Cervantes", "El Quijote");
        Clothes clothes1 = new Clothes(2, 20, "Pantalón", "M", "Azul");
        System.out.println(book1);
        System.out.println(clothes1);

        List<Product> products = new ArrayList<>();
        products.add(book1);
        products.add(clothes1);

        showProducts(products);
    }

    public static void showProducts(List<Product> products) {
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}