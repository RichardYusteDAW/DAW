/*Modifica el ejercicio anterior para que la aplicación para que el usuario pueda elegir el tamaño del array.*/
package ejercicios.Unidad7;

import java.util.Scanner;

public class U7_2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Indica el tamaño del array: ");
        int[] numbers = new int[in.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
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