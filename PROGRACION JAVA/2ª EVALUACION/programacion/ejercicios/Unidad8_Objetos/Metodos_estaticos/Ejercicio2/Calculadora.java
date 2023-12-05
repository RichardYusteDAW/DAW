/*
Haz que el resultado sea una propiedad de la clase Calculadora. 
En cada método, se deberá almacenar el resultado en esa propiedad y devolverlo.
 */
package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio2;

public class Calculadora {
    private static int suma, resta, multiplicacion, division;

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        sumar(num1, num2);
        restar(num1, num2);
        multiplicar(num1, num2);
        dividir(num1, num2);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }

    public static void sumar(int num1, int num2) {
        suma = num1 + num2;
    }

    public static void restar(int num1, int num2) {
        resta = num1 - num2;
    }

    public static void multiplicar(int num1, int num2) {
        multiplicacion = num1 * num2;
    }

    public static void dividir(int num1, int num2) {
        division = num1 / num2;
    }
}
