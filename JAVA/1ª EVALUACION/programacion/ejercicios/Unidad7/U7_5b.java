/*Modifica el programa anterior para que los alumnos aprobados se añadan a otra lista. 
Muestra la lista de aprobados cuando se hayan introducido todas las notas 
(no hace falta mostrar la frase anterior por cada alumno aprobado).*/
package ejercicios.Unidad7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U7_5b {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        lista = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        Scanner in = new Scanner(System.in);

        for (String name : lista) {
            System.out.print("Dime la nota de " + name + ": ");
            if (in.nextInt() >= 5) {
                lista2.add(name);
            }
        }
        System.out.println("Los alumnos aprobados son: " + lista2);

        in.close();
    };
}