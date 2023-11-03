package ejercicios;
import java.util.Scanner;

/* 1A
Crea un programa que calcule el área de un triángulo con base 5 y altura 10 
(recuerda que la fórmula del área es (base * altura) / 2). 
Tanto la base como la altura deberán ser constantes de tipo entero y el área una variable del mismo tipo (entero).
*/

class Unidad1
{
    public static void main(String[] args)
    {
        int base   = 5;
        int altura = 10;
        int area = base * altura / 2;

        System.out.println("El área del triángulo es: " + area);


        /* 1B
        Modifica el tipo de la variable area a float. 
        Cambia el valor de la altura por 9 y ejecuta el programa de nuevo. 
        Calcula el área a mano y comprueba si coincide con la salida del programa. 
        Haz los cambios necesarios sin modificar el tipo de las constantes para que ambas respuestas sean iguales.
        */
        float areaFloat = (float) area;
        altura = 9;
        System.out.println("El área del triángulo es: " + areaFloat);


        /* 1C
        Modifica el tipo de las constantes en el ejercicio 1a para que salga la respuesta correcta.
        */
        float area2 = (float)base * altura / 2;
        System.out.println("El área del triángulo es: " + area2);

        /* 1D
         Haz que la altura y la base las introduzca el usuario por teclado.
        */

        //1º añadimos esta línea al inicio del programa: import java.util.Scanner;
        Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una base: ");
        float baseLeida = reader.nextFloat();

        System.out.println("Introduce una altura: ");
        float alturaLeida = reader.nextFloat();
        
        float areaFinal = baseLeida * alturaLeida / 2;
        System.out.println("El área del triángulo es: " + areaFinal);
        

        /* 2A
        Crea la constante NUMBER de tipo entero con un valor de 8. Muestra por pantalla la tabla de multiplicar de ese número.
        */
        final int NUMBER = 8;
        System.out.println(); //Salto de línea;
        System.out.println("Tabla del 8:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(NUMBER + "*" + i + "=" + i*NUMBER);
        }


        /* 2B
        Modifica el ejercicio anterior para que el resultado sea un float sin modificar el tipo de la constante.
        */
        final int NUMBER1 = 8;
        System.out.println(); //Salto de línea;
        System.out.println("Resultado con FLOAT:");
        for (float i = 0; i <= 10; i++) {
            System.out.println(NUMBER1 + "*" + i + "=" + i*NUMBER1);
        }


        /* 2C
        Haz que la tabla de multiplicar se muestre del número introducido por el usuario por el teclado.
        */
        System.out.println(); //Salto de línea;
        System.out.println("Dime un número del 1 al 10: ");
        final int NUMBER2 = reader.nextInt();
        System.out.println("Tabla del número solicitado:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(NUMBER2 + "*" + i + "=" + i*NUMBER2);
        }

        reader.close();
     }
}