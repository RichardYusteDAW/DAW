/*Modifica el programa anterior para que la aplicación no distinga entre mayúsculas o minúsculas 
(si el usuario introduce Rojo funcionará igual que si introduce rojo).*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_4b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un color: ");
        String color = in.nextLine().toLowerCase();

        switch (color) {
            case "rojo":
                System.out.println("Color de la sangre");
                break;
            case "azul":
                System.out.println("Color del cielo");
                break;
            case "amarillo":
                System.out.println("Color del sol");
                break;

            default:
                System.out.println("Lo siento, ese color es muy aburrido");
                break;
        }

        in.close();
    }
}