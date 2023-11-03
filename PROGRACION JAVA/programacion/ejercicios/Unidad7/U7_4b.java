/*Modifica la aplicación anterior para que el tamaño del conjunto sea variable. 
El usuario introducirá números en el conjunto hasta que escriba un 0 (cero). 
El 0 no debe formar parte del conjunto final.*/
package ejercicios.Unidad7;

import java.util.HashSet;
import java.util.Scanner;

public class U7_4b {
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
            conjunto.add(num);
        } while (num != 0);

        System.out.println("El conjunto es: " + conjunto);
        in.close();
    };
}