/*Crea una función que reciba un número variable de enteros y devuelva la suma de todos ellos.*/
package ejercicios.Unidad6;

public class U6_4a {
    static int add(int... nums) {
        int suma = 0;

        /*
         * for (int i = 0; i < nums.length; i++) {
         * suma += nums[i];
         * }
         */

        for (int num : nums) {
            suma += num;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3));
    }
}