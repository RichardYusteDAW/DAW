/*Modifica el ejercicio anterior para calcular si el número es par o impar usando el operado ternario. 

Para ello, crea una variable par de tipo boolean.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        boolean par = num % 2 == 0 ? true : false;

        if (par) {
            System.out.print("El número introducido es par");
        } else {
            System.out.print("El número introducido es impar");

        }

        in.close();
    }
}