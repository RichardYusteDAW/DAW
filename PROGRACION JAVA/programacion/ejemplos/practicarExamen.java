import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practicarExamen {
    public static void main(String[] args) {

        List<Integer> primos = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num = in.nextInt();

        boolean primo;
        for (int i = 2; i <= num; i++) {
            primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos.add(i);
            }
        }
        System.out.print("Los primos son: ");
        for (int n : primos) {
            System.out.print(n + " ");
        }
        in.close();

        System.out.println(Math.abs(-10));
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.round(1.5));
        System.out.println(Math.ceil(1.5));
        System.out.println(Math.floor(1.5));
        System.out.println(Math.random());
        System.out.println(Math.max(10, 20));

        String saludo = "Hola mundo";
        String saludo2 = "   Hola mundo   ";

        System.out.println(saludo.length());// 12
        System.out.println(saludo.charAt(3));// a
        System.out.println(saludo.substring(0, 4));// Hola
        System.out.println(saludo.indexOf("mundo"));// 2
        System.out.println(saludo.toUpperCase());// HOLA MUNDO
        System.out.println(saludo.equals(saludo2));// false
        System.out.println(saludo2.trim());// Hola mundo
        System.out.println(saludo2);
        System.out.println(saludo.replace('o', 'a'));// Hala munda

        saludo.split(" ");
        System.out.println(saludo.split(" ")[0]); // Hola
        System.out.println(saludo.split(" ")[1]); // mundo

    }
}