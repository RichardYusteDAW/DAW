/*Haz una función recursiva que sume los números naturales (enteros positivos sin contar el 0) hasta un número introducido por pantalla.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_6a {
    static int sumaRecursiva(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num + sumaRecursiva((num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num = in.nextInt();

        System.out.println(sumaRecursiva(num));

        in.close();
    }
}