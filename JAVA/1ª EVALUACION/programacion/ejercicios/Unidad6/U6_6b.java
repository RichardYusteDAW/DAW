package ejercicios.Unidad6;

/*Haz que a la función anterior se le pueda pasar un número negativo, 
con lo que sumará desde el 0 hasta ese número negativo (la función tiene que seguir siendo recursiva). 
También se le podrá pasar el 0, con lo que el resultado devuelto debería ser 0.*/
import java.util.Scanner;

public class U6_6b {
    static int sumaRecursiva(int num) {
        if (num >= 0) {
            if (num == 1) {
                return 1;
            } else if (num == 0) {
                return 0;
            } else {
                return num + sumaRecursiva(num - 1);
            }
        } else {
            return num + sumaRecursiva(num + 1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num = in.nextInt();

        System.out.println(sumaRecursiva(num));

        in.close();
    }
}