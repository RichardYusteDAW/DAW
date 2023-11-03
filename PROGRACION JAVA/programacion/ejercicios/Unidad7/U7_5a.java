/*Haz un programa que contenga una lista de alumnos con los siguientes valores:
("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María")
Por cada alumno, el programa pedirá la nota 
y mostrará la frase “El alumno nombre_alumno está aprobado con nota_alumno” si la nota es mayor o igual a 5.*/
package ejercicios.Unidad7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U7_5a {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        Scanner in = new Scanner(System.in);

        int nota;
        for (String name : lista) {
            System.out.print("Dime la nota de " + name + ": ");
            nota = in.nextInt();
            if (nota >= 5) {
                System.out.println("El alumno " + name + " está aprobado con " + nota);
            }
        }

        in.close();
    };
}