/*Utiliza un bucle for-each para mostrar el cuadrado de los números del ejercicio anterior.*/
package ejercicios.Unidad7;

public class U7_1b {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 8, 13, 21, 34, 55 };

        for (int i : numbers) {
            System.out.println(i * i);
        }
    }
}