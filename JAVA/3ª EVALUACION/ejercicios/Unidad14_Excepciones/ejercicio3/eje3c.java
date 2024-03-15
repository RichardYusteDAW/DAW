/*
Crea dos excepciones de tipo Exception dentro de un nuevo package llamado exception. 
La primera será AgeLowerException y su mensaje será “Tienes que ser mayor de edad para pasar”. 
La segunda será AgeTopException y su mensaje “Tienes que tener menos de 65 años para pasar”.

Haz que el método que comprueba la edad en la aplicación principal lance esos tipos de excepciones según el caso.
Captura en la aplicación principal ambos tipos de excepciones y si el usuario introduce un dato incorrecto.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.AgeLowerException;
import exception.AgeTopException;

public class eje3c {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Dime tu edad: ");
            int age = in.nextInt();

            if (checkAge(age)) {
                System.out.println("Puedes pasar");
            }

        } catch (InputMismatchException ime) {
            System.out.println("La edad tiene que ser un entero");
        } catch (AgeLowerException ale) {
            System.out.println(ale.getMessage());
        } catch (AgeTopException ate) {
            System.out.println(ate.getMessage());
        }

    }

    public static boolean checkAge(int age) throws AgeLowerException, AgeTopException {
        if (age < 18) {
            throw new AgeLowerException();
        } else if (age > 65) {
            throw new AgeTopException();
        }
        return true;
    }
}