/*Crea un conjunto de números enteros. Pide por pantalla el tamaño del conjunto, 
y haz que el usuario vaya metiendo números al conjunto hasta alcanzar el tamaño introducido. 
Muestra el conjunto final por pantalla.*/
package ejercicios.Unidad7;

import java.util.HashSet;
import java.util.Scanner;

public class U7_4a {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("Dime el tamaño del conjunto: ");
        int total = in.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.print("Dime un número: ");
            conjunto.add(in.nextInt());
        }

        System.out.println("El conjunto es: " + conjunto);
        in.close();
    };
}