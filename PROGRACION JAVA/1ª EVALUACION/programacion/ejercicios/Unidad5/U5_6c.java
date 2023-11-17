/*Modifica el programa anterior (puedes usar el bucle while o el for) utilizando la sentencia continue dentro del bucle.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_6c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        for (int i = 1; i < num; i++) {
            if (i == 4) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        in.close();
    }
}