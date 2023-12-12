/*Haz que el array del ejercicio 1.a se modifique con el cuadrado de cada número y muéstralo por pantalla.*/
package ejercicios.Unidad7;

public class U7_1c {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 8, 13, 21, 34, 55 };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}