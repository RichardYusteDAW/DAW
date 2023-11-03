/*Escribe un programa que muestre la tabla de multiplicar de un número introducido por el usuario.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_8a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

        in.close();
    }
}