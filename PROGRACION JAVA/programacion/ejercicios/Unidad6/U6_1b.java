/*Haz que la aplicación anterior muestre la frase “Error: División por 0” cuando el segundo número sea 0 en la división.*/
package ejercicios.Unidad6;

import java.util.Scanner;

public class U6_1b {
    // Functions:
    static void sumar(int a, int b) {
        System.out.println(a + b);
    };

    static void restar(int a, int b) {
        System.out.println(a - b);
    };

    static void multiplicar(int a, int b) {
        System.out.println(a * b);
    };

    static void dividir(float a, float b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return;
        }
        System.out.println(a / b);
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num1 = in.nextInt();
        System.out.print("Dime otro número: ");
        int num2 = in.nextInt();
        System.out.print("¿Qué operación quieres hacer? sumar/restar/multiplicar/dividir: ");
        String op = in.next();

        switch (op) {
            case "sumar":
                sumar(num1, num2);
                break;
            case "restar":
                restar(num1, num2);
                break;
            case "multiplicar":
                multiplicar(num1, num2);
                break;
            case "dividir":
                dividir(num1, num2);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
        in.close();
    }
}