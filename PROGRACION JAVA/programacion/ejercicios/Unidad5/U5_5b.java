/*Modifica el programa anterior utilizando un bucle for*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_5b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int fact = num;
        for (int i = num - 1; i > 0; i--) {
            fact *= i;
        }

        System.out.println("El factorial de " + num + " es " + fact);
        in.close();
    }
}