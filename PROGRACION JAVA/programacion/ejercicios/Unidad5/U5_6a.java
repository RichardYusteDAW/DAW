/*Escribe un programa que pida un número por pantalla. 
La salida será todos los números pares que hay entre 1 y ese número. 
Usa un bucle while*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_6a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int i = 1;
        while (i < num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        in.close();
    }
}