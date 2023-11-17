/*Usa el operador ternario para calcular el mayor de los dos números del ejercicio anterior.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = in.nextInt();

        int mayor = num1 > num2 ? num1 : num2;

        System.out.print("El número mayor de los dos es: " + mayor);

        in.close();
    }
}