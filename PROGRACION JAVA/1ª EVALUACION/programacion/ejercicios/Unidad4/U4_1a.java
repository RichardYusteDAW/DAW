/*Escribe un programa que pida dos números de tipo float al usuario. 
La aplicación deberá sacar por pantalla la suma, resta, multiplicación, división y resto de la división entera de ambos números.*/
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float num1 = in.nextFloat();

        System.out.print("Dime otro número: ");
        float num2 = in.nextFloat();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        in.close();
    }
}