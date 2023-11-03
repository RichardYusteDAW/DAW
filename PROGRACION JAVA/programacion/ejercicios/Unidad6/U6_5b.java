/*Modifica el programa anterior para que la aplicación muestre un menú donde el usuario podrá elegir entre calcular 
el área de un cuadrado o de un triángulo con los métodos anteriores. 
La aplicación deberá pedir los datos correspondientes (lado o altura y base) según la opción escogida.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_5b {
    static float area(int a) {
        return a * a;
    }

    static float area(int a, int b) {
        return a * b / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¿Qué operación quieres hacer?\n" +
                "1. Área triángulo\n" +
                "2. Área cuadrado");
        int op = in.nextInt();

        if (op == 1) {
            System.out.print("Dime la base : ");
            int base = in.nextInt();
            System.out.print("Dime la altura : ");
            int altura = in.nextInt();
            System.out.println("El área del triángulo es " + area(base, altura));
        } else if (op == 2) {
            System.out.print("Dime el lado : ");
            int lado = in.nextInt();
            System.out.println("El área del triángulo es " + area(lado));
        } else {
            System.out.println("Invalid option");
        }
        in.close();
    }
}