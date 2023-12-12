/*Modifica el ejercicio anterior para usar solo una sentencia if, sin sentencia else.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = in.nextInt();
        String mssg = "Puedes pasar";

        if (edad < 18) {
            mssg = "No puedes pasar";
        }

        System.out.print(mssg);

        in.close();
    }
}