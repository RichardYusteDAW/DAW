package Unidad14_Excepciones.ejercicio2;
/*
Cambia el tipo de excepción que devuelve el método que comprueba la edad a RuntimeException y vuelve a eliminar el bloque try..catch del método main(). 
¿Por qué ahora el compilador sí que te deja ejecutar el programa?
*/

import java.util.Scanner;

public class eje2d {
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