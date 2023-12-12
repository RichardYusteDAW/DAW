/*Haz que la inicialización del array y mostrar los elementos del ejercicio anterior sean dos funciones separadas.*/
package ejercicios.Unidad7;

import java.util.Scanner;

public class U7_2c {
    static Scanner in = new Scanner(System.in);

    static int[] iniciarArray() {
        System.out.print("Indica el tamaño del array: ");
        int[] numbers = new int[in.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            String mensaje = (i == 0)
                    ? "Introduce un número: "
                    : "Introduce otro número: ";
            System.out.print(mensaje);
            numbers[i] = in.nextInt();
        }
        return numbers;
    }

    static void mostrarArray() {
        for (int i : iniciarArray()) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        mostrarArray();
        in.close();
    }
}