/*Crea un array de 5 enteros. Haz que la aplicación pida al usuario cada elemento del array y, al acabar, muéstralo por pantalla.*/
package ejercicios.Unidad7;

import java.util.Scanner;

public class U7_2a {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String mensaje = (i == 0)
                    ? "Introduce un número: "
                    : "Introduce otro número: ";
            System.out.print(mensaje);
            numbers[i] = in.nextInt();
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        in.close();
    }
}