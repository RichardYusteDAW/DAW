/*Haz un programa que muestre un menú con 3 opciones. 
Cuando el usuario elija una opción, la aplicación mostrará por pantalla “Ha elegido la opción número_opcion”. 
Ejemplo:
1.- Opción A
2.- Opción B
3.- Opción C
--------------------
Opción:2
Ha elegido la opción2
*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_9a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = "1.- Opción A\n" +
                "2.- Opción B\n" +
                "3.- Opción C\n" +
                "--------------------\n" +
                "Opción: ";
        System.out.print(message);
        int num = in.nextInt();

        System.out.println("Ha elegido la opción: " + num + "\n");

        in.close();
    }
}