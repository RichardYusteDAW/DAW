/*Modifica el programa anterior utilizando la sentencia break dentro del bucle.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_7b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int multiplo = num + 1;
        while (!(multiplo % num == 0)) {
            multiplo++;
            if (multiplo % num == 0) {
                break;
            }
        }

        System.out.println("El primer múltiplo de " + num + " es " + multiplo);
        in.close();
    }
}