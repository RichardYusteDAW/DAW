/*
Modifica el método de la clase principal que muestra por pantalla los productos para que se puede elegir los productos a mostrar 
(todos, la ropa o los libros).
*/
package ejercicios.Unidad9_Herencia_y_composicion.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int op;
    private static String menu = "1. Mostrar todos los productos\n" +
            "2. Mostrar ropa\n" +
            "3. Mostrar libros\n" +
            "0. Salir\n" +
            "Selecciona una opción: ";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Books book1 = new Books(1, 10, "Cervantes", "El Quijote");
        Clothes clothes1 = new Clothes(2, 20, "Pantalón", "M", "Azul");
        products.add(book1);
        products.add(clothes1);

        do {
            System.out.print(menu);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    showProducts(products, "all");
                    break;
                case 2:
                    showProducts(products, "clothes");
                    break;
                case 3:
                    showProducts(products, "books");
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println();
            }
        } while (op != 0);

        sc.close();
    }

    private static void showProducts(List<Product> products, String type) {
        for (Product product : products) {
            if ("all".equals(type) || ("books".equals(type) && product instanceof Books)
                    || ("clothes".equals(type) && product instanceof Clothes)) {
                System.out.println(product);
            }
        }
        System.out.println();
    }
}