/*Crea un programa que calcule el área de un cuadrado y de un triángulo. 
Utiliza sobrecarga de métodos para calcular ambas áreas.*/
package ejercicios.Unidad6;

public class U6_5a {
    static float area(int a) {
        return a * a;
    }

    static float area(int a, int b) {
        return a * b / 2;
    }

    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(4, 2));
    }
}