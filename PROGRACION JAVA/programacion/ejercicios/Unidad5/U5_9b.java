/*Haz que el menú anterior tenga una última opción que sea “0.- salir”. 
La aplicación no terminará hasta que el usuario escoja la opción 0.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_9b {
    public static void main(String[] args) {
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
}