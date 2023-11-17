/*Haz que el resultado anterior se muestre con 3 decimales.*/
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float num = in.nextFloat();

        System.out.print("La raiz cuadrada de " + num + " es: " + String.format("%.3f", Math.sqrt(num)));

        in.close();
    }
}