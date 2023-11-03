/*Busca en la clase Math el método que permite elevar un número a una potencia. 
Escribe un programa en Java donde se introduzca por pantalla un número y la potencia a la que elevar dicho número 
y muestre el resultado formateado a dos decimales.*/
package ejercicios.Unidad4;

import java.util.Scanner;

public class U4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime la base: ");
        float base = in.nextFloat();

        System.out.print("Dime el exponente: ");
        int exp = in.nextInt();

        System.out.println((int) base + " ^ " + (int) exp + " = " + String.format("%.2f", Math.pow(base, exp)));

        in.close();
    }
}