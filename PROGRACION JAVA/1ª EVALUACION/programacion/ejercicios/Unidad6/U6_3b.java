/*Cambia la función anterior para que la función devuelva 1 si el primer número es mayor que el segundo, 
-1 si el segundo es el mayor o 0 si son iguales.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_3b {
    static int mayor(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = in.nextInt();

        System.out.println(mayor(num1, num2));
        ;
        in.close();
    }
}