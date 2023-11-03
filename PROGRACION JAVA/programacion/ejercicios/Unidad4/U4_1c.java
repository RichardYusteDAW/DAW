/*Utiliza el método format() de la clase String para formatear el resultado de las operaciones con solo 2 decimales.*/
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float num1 = in.nextFloat();

        System.out.print("Dime otro número: ");
        float num2 = in.nextFloat();

        System.out.println(num1 + " + " + num2 + " = " + String.format("%.2f", (num1 + num2)));
        System.out.println(num1 + " - " + num2 + " = " + String.format("%.2f", (num1 - num2)));
        System.out.println(num1 + " * " + num2 + " = " + String.format("%.2f", (num1 * num2)));
        System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", (num1 / num2)));
        System.out.println(num1 + " % " + num2 + " = " + String.format("%.2f", (num1 % num2)));

        in.close();
    }
}