/*Utiliza la clase Random para generar un número entero aleatorio entre 0 y 9
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html*/
package ejercicios.Unidad4;

import java.util.Random;

public class U4_5a {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(10);

        System.out.println("Esto es un número aleatorio entre 1 y 9: " + num);
    }
}