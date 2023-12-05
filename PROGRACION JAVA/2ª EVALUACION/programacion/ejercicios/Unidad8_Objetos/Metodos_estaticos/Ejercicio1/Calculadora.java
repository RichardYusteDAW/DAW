/*
Crea una clase Calculadora con 4 métodos estáticos: sumar(), restar(), multiplicar() y dividir(). 
Todos los métodos recibirán 2 números enteros y el resultado también será entero. 
Prueba la clase con diferentes operaciones. 
*/
package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio1;

public class Calculadora {
    private static int num1 = 10;
    private static int num2 = 2;

    public static void main(String[] args) {
        System.out.println(Calculadora.sumar(Calculadora.num1, Calculadora.num2));
        System.out.println(restar(num1, num2)); // Al llamarse desde la propia clase no hace falta poner "Calculadora."
        System.out.println(multiplicar(num1, num2));
        System.out.println(dividir(num1, num2));
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
