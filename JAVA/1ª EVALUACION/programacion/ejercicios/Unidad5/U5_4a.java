/*Escribe un programa que pida un color por teclado. 
Si el color es rojo la aplicación escribirá “Color de la sangre”. 
Si es azul, “Color del cielo”. 
Si es amarillo, “Color del sol”. 
Si no es ninguno de ese color, se mostrará el texto “Lo siento, ese color es muy aburrido”.*/
package ejercicios.Unidad5;

import java.util.Scanner;

public class U5_4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un color: ");
        String color = in.nextLine();

        switch (color) {
            case "rojo":
                color = "Color de la sangre";
                break;
            case "azul":
                color = "Color del cielo";
                break;
            case "amarillo":
                color = "Color del sol";
                break;

            default:
                color = "Lo siento, ese color es muy aburrido";
                break;
        }
        System.out.println(color);

        in.close();
    }
}