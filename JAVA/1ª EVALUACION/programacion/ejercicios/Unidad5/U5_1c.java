/*Modifica el primer ejercicio para utilizar el operador ternario. */
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = in.nextInt();
        String mssg = edad < 18
                ? "No puedes pasar"
                : "Puedes pasar";

        System.out.print(mssg);

        in.close();
    }
}