/*Haz que el programa anterior muestre los resultados como enteros, 
sin modificar el tipo de las variables. */
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float num1 = in.nextFloat();

        System.out.print("Dime otro número: ");
        float num2 = in.nextFloat();

        System.out.println(num1 + " + " + num2 + " = " + (int) (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (int) (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (int) (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (int) (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (int) (num1 % num2));

        in.close();
    }
}