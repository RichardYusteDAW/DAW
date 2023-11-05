/*Haz que el programa anterior muestre, además de la tabla de multiplicar, el sumatorio desde 1 hasta el resultado 
(es decir, si el resultado es 6, calculará 6+5+4+3+2+1).*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_8b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();

        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);

            for (int j = (resultado - 1); j > 0; j--) {
                resultado += j;
            }
            System.out.println("Suma: " + resultado);
        }

        in.close();
    }
}