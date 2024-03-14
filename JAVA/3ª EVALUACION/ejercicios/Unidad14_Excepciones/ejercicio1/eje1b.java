/*
Modifica la aplicación anterior para que se cierre siempre el objeto de tipo Scanner pase lo que pase.
*/
package Unidad14_Excepciones.ejercicio1;

import java.util.Scanner;

public class eje1b {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) { // Esta es la manera de cerrar el scanner a través de un try-with-resources

            System.out.print("Introduce un número: ");
            int num = in.nextInt();

            System.out.println(num * 2);

        } catch (Exception e) {

            System.out.println("Algo ha salido mal");

        } /*finally { // Esta sería la manera habitual de cerrar el scanner.
            in.close();
          }*/
    }
}