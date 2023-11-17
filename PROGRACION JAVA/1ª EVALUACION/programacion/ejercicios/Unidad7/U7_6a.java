/*Crea un Map con los nombres de los alumnos y sus notas. 
El programa deberá pedir la nota de un listados predefinido de alumnos (puedes utilizar los anteriores) 
y a continuación mostrará el Map por pantalla.*/
package ejercicios.Unidad7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class U7_6a {
    public static void main(String[] args) {
        List<String> lista = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "María");
        Map<String, Integer> diccionario = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (String name : lista) {
            System.out.print("Dime la nota de " + name + ": ");
            diccionario.put(name, in.nextInt());
        }
        System.out.println("Los alumnos y sus notas son: " + diccionario);

        in.close();
    };
}