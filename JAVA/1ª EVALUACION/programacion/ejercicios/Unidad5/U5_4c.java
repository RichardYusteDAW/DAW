/*Modifica el programa anterior para que a la hora de evaluar el color, 
no tenga en cuenta los espacios en blanco del principio y el final. 
Es decir, si el usuario introduce: "    Rojo" la aplicación funcionará igual.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_4c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un color: ");
        String color = in.nextLine().toLowerCase().trim();

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