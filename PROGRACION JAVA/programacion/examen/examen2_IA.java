package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class examen2_IA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dime un número: ");
        int num = in.nextInt();
        System.out.print("Dime el límite superior: ");
        int upper = in.nextInt();
        System.out.println("Todos lo múltiplos entre " + num + " y " + upper + " son: " + multiples(num, upper));

        System.out.println("Dime un número: ");
        num = in.nextInt();
        System.out.println("El siguiente número primo es: " + nextPrime(num));

        in.close();
    }

    static List<Integer> multiples(int num, int upper) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = num; i <= upper; i += num) {
            multiples.add(i);
        }
        return multiples;
    }

    static int nextPrime(int num) {
        int prime = num + 1;
        while (prime % prime != 0) {
            prime++;
        }
        return prime;
    }
}
