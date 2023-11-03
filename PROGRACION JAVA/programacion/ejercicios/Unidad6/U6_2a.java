/*Crea el menú del ejercicio 9.a del tema anterior mediante una función.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_2a {
    static void menu() {
        Scanner in = new Scanner(System.in);
        String message = "1.- Opción A\n" +
                "2.- Opción B\n" +
                "3.- Opción C\n" +
                "--------------------\n" +
                "Opción: ";
        System.out.print(message);
        int num = in.nextInt();

        System.out.println("Ha elegido la opción: " + num + "\n");

        in.close();
    }

    public static void main(String[] args) {
        menu();
    }
}