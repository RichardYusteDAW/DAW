/*Haz un programa que calcule si un número introducido por teclado es par o impar usando sentencias if-else.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.print("El número introducido es par");
        } else {
            System.out.print("El número introducido es impar");

        }

        in.close();
    }
}