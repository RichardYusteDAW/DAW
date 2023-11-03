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
    }
}