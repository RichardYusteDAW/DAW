/*
Cambia el tipo de excepciones creadas anteriormente a RuntimeException. ¿Puedes cambiar algo en la clase principal?
*/

import java.util.InputMismatchException;
import java.util.Scanner;

import runtimeexception.AgeLowerException;
import runtimeexception.AgeTopException;

public class eje3d {
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
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
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