/*
Haz una aplicación que pida un número por pantalla y muestre el resultado de multiplicarlo por 2. 
Si ocurre alguna excepción (el número introducido no tiene el formato correcto, por ejemplo) 
la aplicación deberá mostrar el mensaje de error “Algo ha salido mal”.
*/
package Unidad14_Excepciones.ejercicio1;

import java.util.Scanner;

public class eje1a {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int num = in.nextInt();

            System.out.println(num * 2);

            in.close();
        } catch (Exception e) {
            System.out.println("Algo ha salido mal");
        }
    }
}