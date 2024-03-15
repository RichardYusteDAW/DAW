/*
Modifica la aplicación anterior para que se muestre la frase “No puedes pasar” si la edad introducida es menor de 18 años o mayor que 65. 
Para eso, lanza una excepción de tipo RuntimeException en el método que comprueba la edad si se cumple alguna de esas condiciones.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class eje3a {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Dime tu edad: ");
            int age = in.nextInt();

            if (checkAge(age)) {
                System.out.println("Puedes pasar");
            }

        } catch (InputMismatchException ime) {
            System.out.println("La edad tiene que ser un entero");
        } catch (RuntimeException re) {
            System.out.println("Tienes que ser mayor de edad para pasar");
        }

    }

    public static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException();
        }
        return true;
    }
}
