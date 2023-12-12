/*Modifica la función anterior para que sume sólo los números impares.*/
package ejercicios.Unidad6;

public class U6_4b {
    static int add(int... nums) {
        int suma = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5, 6, 7));
    }
}