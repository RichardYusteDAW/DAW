/*
Crea 3 clases llamadas HD, Memory y CPU:
- La clase HD tendrá las propiedades type y capacity.
- La clase Memory la propiedad capacity.
- La clase CPU model y speed.
Haz los correspondientes getters, el método toString() y el constructor en cada una de las clases recién creadas.

Crea una nueva clase que herede de Product llamada Computer. 
Esta clase estará compuesta de una memoria, una CPU y un disco duro. 
En la clase principal, crea un nuevo ordenador y modifica el método que muestra por pantalla los productos 
para que se pueda elegir mostrar solo los ordenadores.
*/
package ejercicios.Unidad9_Herencia_y_composicion.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int op;
    private static String menu = "1. Mostrar todos los productos\n" +
            "2. Mostrar ropa\n" +
            "3. Mostrar libros\n" +
            "4. Mostrar ordenadores\n" +
            "0. Salir\n" +
            "Selecciona una opción: ";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Books book1 = new Books(1, 10, "Cervantes", "El Quijote");
        Clothes clothes1 = new Clothes(2, 20, "Pantalón", "M", "Azul");
        Computer computer1 = new Computer(3, 30, new Memory(8), new CPU("Intel", 3), new HD("SSD", 500));
        products.add(book1);
        products.add(clothes1);
        products.add(computer1);

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
                case 4:
                    showProducts(products, "computers");
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
                    || ("clothes".equals(type) && product instanceof Clothes)
                    || ("computers".equals(type) && product instanceof Computer)) {
                System.out.println(product);
            }
        }
        System.out.println();
    }
}