/*
Escribe un programa en Java que:
- cree una matriz bidimensional de números enteros aleatorios.
- muestre por pantalla la suma de los elementos de cada fila.
- la suma de los elementos de cada columna. 
*/

import java.util.Random;
import java.util.Scanner;

public class Bidimensionales {
    public static void main(String[] args) {
        int[][] array = createArray();

        showArray(array);

        for (int i = 0; i < addRows(array).length; i++) {
            int numFile = i + 1;
            System.out.println("La suma de la fila " + numFile + " es: " + addRows(array)[i]);
        }

        for (int i = 0; i < addColumns(array).length; i++) {
            int numCol = i + 1;
            System.out.println("La suma de la columna " + numCol + " es: " + addColumns(array)[i]);
        }
    }

    public static int[][] createArray() {
        Scanner in = new Scanner(System.in);

        System.out.print("Dime el tamaño del array: ");
        final int SIZE = in.nextInt();
        int[][] array = new int[4][5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        in.close();

        return array;
    }

    public static void showArray(int[][] array) {
        for (int[] row : array) {
            System.out.println();
            for (int cell : row) {
                System.out.print(cell);
            }
        }
        System.out.println();
    }

    public static int[] addRows(int[][] array) {
        int[] addRows = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int accumulator = 0;
            for (int j = 0; j < array[i].length; j++) {
                accumulator += array[i][j];
            }
            addRows[i] = accumulator;
        }
        return addRows;
    }

    public static int[] addColumns(int[][] array) {
        int[] addCols = new int[array.length];

        for (int i = 0; i < array[0].length; i++) {
            int accumulator = 0;
            for (int j = 0; j < array.length; j++) {
                accumulator += array[j][i];
            }
            addCols[i] = accumulator;
        }
        return addCols;
    }
}
