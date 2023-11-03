/*Modifica la aplicación anterior para que el usuario introduzca el mínimo 
y el máximo entre los que se generará el número entero aleatorio.*/
package ejercicios.Unidad4;

import java.util.Random;
import java.util.Scanner;

public class U4_5b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime el mínimo: ");
        int min = in.nextInt();

        System.out.print("Dime el máximo: ");
        int max = in.nextInt();

        Random aleatorio = new Random();
        // int num = aleatorio.nextInt(max + 1 - min) + min;
        int num = aleatorio.nextInt(min, max);

        System.out.println("Esto es un número aleatorio entre " + min + " y " + max + " : " + num);

        in.close();
    }
}