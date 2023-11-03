/*Haz una aplicación que pida un número binario al usuario.
El programa mostrará los bits (empezando por el de la derecha) utilizando las matrices anteriores.
La aplicación mostrará la frase “No se puede representar el bit” si éste no es un 1 o un 0.*/
package ejercicios.Unidad7;

import java.util.Scanner;

public class U7_3c {
    static boolean[][] matriz1 = {
            { true, true, true, true, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, true, true, true, true }
    };
    static boolean[][] matriz2 = {
            { false, false, false, false, true },
            { false, false, false, true, true },
            { false, false, true, false, true },
            { false, true, false, false, true },
            { true, false, false, false, true },
            { false, false, false, false, true },
            { false, false, false, false, true },
            { false, false, false, false, true }
    };

    static void mostrarArray(boolean[][] matriz) {
        for (boolean[] fila : matriz) {
            System.out.println();
            for (boolean celda : fila) {
                System.out.print(celda ? 0 : " ");
            }
        }
        ;
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número en binario");

        String binario = in.nextLine();
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                mostrarArray(matriz2);
            } else if (binario.charAt(i) == '0') {
                mostrarArray(matriz1);
            } else {
                System.out.println("No se puede representar el bit");
            }
        }

        in.close();
    };
}