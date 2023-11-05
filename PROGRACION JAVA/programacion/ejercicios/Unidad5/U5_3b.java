/*Modifica el ejercicio anterior para calcular si el número es par o impar usando el operado ternario. 

Para ello, crea una variable par de tipo boolean.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        String paridad = (num % 2 == 0) ? "El número introducido es par" : "El número introducido es impar";
        System.out.println(paridad);

        in.close();
    }
}