/*Escribe un programa en Java que saque por pantalla la raíz cuadrada de un número introducido por el usuario. 
Para calcular la raíz cuadrada, utiliza el método adecuado de la clase Math:
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html*/
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float num = in.nextFloat();

        System.out.print("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));

        in.close();
    }
}