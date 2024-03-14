package Unidad14_Excepciones.ejercicio2;
/*
Escribe una aplicación que pida al usuario su edad por pantalla. 
Crea un método que devuelva true o false según la edad sea mayor de 18 o menor. 
Muestra por pantalla la frase “Puedes pasar” o “Tienes que ser mayor de edad para pasar”, 
según el resultado del método (sin utilizar excepciones). 
Si ocurre alguna excepción, la aplicación mostrará el mensaje “Algo ha salido mal”. 
*/

import java.util.Scanner;

public class eje2a {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Dime tu edad: ");
            int age = in.nextInt();

            if (checkAge(age)) {
                System.out.println("Puedes pasar");
            } else {
                System.out.println("Tienes que ser mayor de edad para pasar");
            }

        } catch (Exception e) {
            System.out.println("Algo ha salido mal");
        }
    }

    public static boolean checkAge(int age) {
        return age >= 18;
    }
}