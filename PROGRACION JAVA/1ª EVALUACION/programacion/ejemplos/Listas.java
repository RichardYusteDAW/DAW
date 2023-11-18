/*
Escribe un programa en Java que lea una lista de números enteros del usuario. El programa debe mostrar:
- la lista original.
- la lista ordenada de mayor a menor.
- la lista con todos los números pares eliminados
- la lista con tan solo los números que sean primos.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        List<Integer> lista = createList();
        showList(lista);

        orderList(lista);
        showList(lista);

        oddList(lista);
        showList(lista);

        primesList(lista);
        showList(lista);
    }

    public static List<Integer> createList() {
        List<Integer> lista = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int num = in.nextInt();
            lista.add(num);
        }
        in.close();
        return lista;
    }

    public static void showList(List<Integer> lista) {
        System.out.println(lista);
    }

    public static List<Integer> orderList(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i) < lista.get(j)) {
                    int temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }

    public static List<Integer> oddList(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.remove(i);
            }
        }
        return lista;
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static List<Integer> primesList(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (!isPrime(lista.get(i))) {
                lista.remove(i);
            }
        }
        return lista;
    }

}
