/*Modifica el ejercicio anterior para que la aplicación muestre un menú con las opciones “Introducir alumno” y “Salir”. 
Cuando se introduce un alumno, el programa pedirá el nombre del alumno y su nota. 
Si la nota es mayor o igual a 5, se añadirá a una lista de alumnos aprobados. 
En caso contrario, se añadirá a la lista de suspendidos. 
Cuando el usuario elija la opción “Salir”, el programa mostrará ambas listas (aprobados y suspendidos).*/
package ejercicios.Unidad7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U7_5c {
    static Scanner in = new Scanner(System.in);

    static void mostarMenu() {
        String menu = "1. Mostrar menu\n" + "0. Salir";
        int op, totalAlumnos, nota;
        String name;

        do {
            System.out.println(menu);
            System.out.print("Introduce una opcion: ");
            op = in.nextInt();

            if (op == 1) {
                List<String> aprobados = new ArrayList<>();
                List<String> suspendidos = new ArrayList<>();

                System.out.print("Dime el numero de alumnos: ");
                totalAlumnos = in.nextInt();
                for (int i = 0; i < totalAlumnos; i++) {
                    System.out.print("Dime el nombre del alumno: ");
                    name = in.next();

                    System.out.print("Ahora dime su nota: ");
                    nota = in.nextInt();

                    if (nota < 5) {
                        suspendidos.add(name);
                    } else {
                        aprobados.add(name);
                    }
                }

                System.out.println("Los alumnos aprobados son: " + aprobados);
                System.out.println("Los alumnos suspendidos son: " + suspendidos);
                break;
            }
        } while (op != 0);
    }

    public static void main(String[] args) {
        mostarMenu();
        in.close();
    };
}