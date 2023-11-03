/*Haz que la aplicación muestre la frase “El número está repetido y no se añadirá al conjunto” 
si el usuario introduce un número que ya existe en el conjunto.*/
package ejercicios.Unidad7;

import java.util.HashSet;
import java.util.Scanner;

public class U7_4c {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<Integer>();
        Scanner in = new Scanner(System.in);

        int num;
        do {
            System.out.print("Dime un número: ");
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (conjunto.contains(num)) {
                System.out.println("El número está repetico y no se añadirá al conjunto");
            } else {
                conjunto.add(num);
            }
        } while (num != 0);

        System.out.println("El conjunto es: " + conjunto);
        in.close();
    };
}