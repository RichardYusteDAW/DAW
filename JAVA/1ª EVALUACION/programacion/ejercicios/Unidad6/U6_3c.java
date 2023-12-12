/*Haz que las variables de entrada del ejercicio anterior (los dos números introducidos por teclado) sean variables globales de la aplicación.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_3c {
    static int num1;
    static int num2;

    static int mayor() {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        num2 = in.nextInt();

        System.out.println(mayor());
        in.close();
    }
}