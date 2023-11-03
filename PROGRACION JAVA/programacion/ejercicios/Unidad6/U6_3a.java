/*Escribe una función que acepte dos números como parámetros de entrada y devuelva el mayor de ellos. 
Haz un programa que utilice esa función para mostrar por pantalla el mayor de dos números introducidos por teclado.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_3a {
    static int mayor(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = in.nextInt();

        System.out.println("El mayor es " + mayor(num1, num2));
        ;
        in.close();
    }
}