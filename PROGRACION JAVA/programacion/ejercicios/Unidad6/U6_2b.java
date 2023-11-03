/*Crea el menú del ejercicio 9.b del tema anterior mediante una función.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_2b {
    static void menu() {
        Scanner in = new Scanner(System.in);
        String message = "1.- Opción A\n" +
                "2.- Opción B\n" +
                "3.- Opción C\n" +
                "0.- Salir\n" +
                "--------------------\n" +
                "Opción: ";

        int num;
        do {
            System.out.print(message);
            num = in.nextInt();
            System.out.println("Ha elegido la opción: " + num + "\n");
            if (num == 0) {
                System.out.println("¡Au cacao!" + "\n");
            }
        } while (num != 0);

        in.close();
    }

    public static void main(String[] args) {
        menu();
    }
}