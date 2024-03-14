package Unidad14_Excepciones.ejercicio2;
/*
Elimina el bloque try..catch del método main(). ¿Por qué el compilador muestra un error? ¿Cómo lo puedes solucionar?
*/

import java.util.Scanner;

public class eje2c {
    public static void main(String[] args) { // Podría propagar la excepción aquí con "throws Exception".

        Scanner in = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int age = in.nextInt();

        if (checkAge(age)) {
            System.out.println("Puedes pasar");
        }

        in.close();
    }

    public static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("No puedes pasar");
        }
        return true;
    }
}