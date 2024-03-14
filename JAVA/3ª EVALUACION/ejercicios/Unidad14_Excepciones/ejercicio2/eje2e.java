package Unidad14_Excepciones.ejercicio2;
/*
Vuelve a capturar las excepciones en el main() (deja la excepción del método que comprueba la edad como RuntimeException) y 
muestra la frase “Puedes pasar” si la edad es mayor que 18 años, 
“Tienes que ser mayor de edad para pasar” si la edad es inferior a 18 años o 
“La edad tiene que ser un entero” si se introduce algo diferente a un entero.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class eje2e {
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