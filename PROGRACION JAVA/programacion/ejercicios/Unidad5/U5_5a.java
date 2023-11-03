/*Escribe un programa que muestre el factorial de un número introducido por pantalla usando un bucle while.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int i = num - 1;
        int fact = num;
        while (i > 0) {
            fact *= i;
            i--;
        }

        System.out.println("El factorial de " + num + " es " + fact);
        in.close();
    }
}