package Unidad14_Excepciones.ejercicio2;
/*
Modifica la aplicación anterior para que el método que comprueba la edad lance una excepción de tipo Exception si la edad es menor de 18 años. 
En el método main(), Si ocurre alguna excepción (del tipo que sea), 
la aplicación mostrará el mensaje “Tienes que ser mayor de edad para pasar”.
*/

import java.util.Scanner;

public class eje2b {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Dime tu edad: ");
            int age = in.nextInt();

            if (checkAge(age)) {
                System.out.println("Puedes pasar");
            }

        } catch (Exception e) {
            System.out.println("Tienes que ser mayor de edad para pasar");
        }
    }

    public static boolean checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
        return true;
    }
}