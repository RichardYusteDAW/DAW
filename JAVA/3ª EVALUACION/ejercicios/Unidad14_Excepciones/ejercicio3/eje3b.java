/*
Modifica la aplicación anterior para que el mensaje de la excepción sea “Tienes que ser mayor de edad para pasar” o 
“Tienes que tener menos de 65 años para pasar” según el tipo de error. 
Utiliza el método correspondiente de la clase Exception para mostrar ese mensaje de error.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class eje3b {
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
            System.out.println(re.getMessage());
        }

    }

    public static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Tienes que ser mayor de edad para pasar");
        } else if (age > 65) {
            throw new RuntimeException("Tienes que tener menos de 65 años para pasar");
        }
        return true;
    }
}