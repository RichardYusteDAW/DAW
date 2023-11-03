/*Escribe un programa que, dado un número encuentre el primer múltiplo de éste (excluyendo el mismo número). 
No utilices la sentencia break.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_7a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int multiplo = num + 1;
        while (!(multiplo % num == 0)) {
            multiplo++;
        }

        System.out.println("El primer múltiplo de " + num + " es " + multiplo);
        in.close();
    }
}