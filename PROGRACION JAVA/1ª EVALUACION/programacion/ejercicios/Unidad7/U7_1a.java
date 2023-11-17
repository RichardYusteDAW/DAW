/*Ejercicio 1.a Crea un array de enteros con los siguientes números: {1, 2, 3, 5, 8, 13, 21, 34, 55}
Haz que se muestre por pantalla el cuadrado de cada número del array utilizando un bucle for sencillo.*/
package ejercicios.Unidad7;

public class U7_1a {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 8, 13, 21, 34, 55 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * numbers[i]);
        }
    }
}