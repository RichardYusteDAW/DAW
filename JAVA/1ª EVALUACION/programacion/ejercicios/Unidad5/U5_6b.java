/*Modifica el programa anterior usando un bucle for*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_6b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        in.close();
    }
}