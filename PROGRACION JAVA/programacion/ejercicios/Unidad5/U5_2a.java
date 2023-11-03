/*Escribe un programa que calcule el mayor de dos números introducidos por teclado.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = in.nextInt();

        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        System.out.print("El número mayor de los dos es: " + mayor);

        in.close();
    }
}