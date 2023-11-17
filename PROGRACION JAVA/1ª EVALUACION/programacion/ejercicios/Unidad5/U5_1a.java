/*Crea luna aplicación que pregunte la edad y muestre la frase “Puedes pasar” o “No puedes pasar” si es mayor de edad o no. 
Utiliza la sentencia if-else.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = in.nextInt();

        if (edad < 18) {
            System.out.print("No puedes pasar");
        } else {
            System.out.print("Puedes pasar");
        }
        in.close();
    }
}