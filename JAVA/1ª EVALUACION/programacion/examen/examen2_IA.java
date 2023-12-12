package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class examen2_IA {
    static Scanner in = new Scanner(System.in);
    static String blue = "\u001B[34m";
    static String red = "\u001B[31m";
    static String resetColor = "\u001B[0m";

    public static void main(String[] args) {
        int op;
        do {
            showMenu();

            System.out.println("0. Salir");
            System.out.print("Dime un opción: ");
            op = in.nextInt();
            in.nextLine(); // limpia el búfer

            if (op != 0) {
                selectMenu(op);
            }

        } while (op != 0);

        in.close();
    }

    static void showMenu() {
        String[] menu = { "Múltiplos", "Siguiente primo", "Cifrado Vigénere", "Fibonacci",
                "Mínimo común múltiplo", "Máximo común divisor", "Número de letra repetida", "Número de palabras",
                "Número de caracteres", "Primera y última letra en mayúsculas", "Longitud de la cadena",
                "Mayúsculas sin espacios", "Minúsculas y guiones", "Longitud de la cadena", "Cadena en mayúsculas",
                "Cadena en minúsculas", "Cadena sin espacios", "Mayúsculas o minúsculas", "Reemplazar caracteres" };

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    static void selectMenu(int op) {
        switch (op) {
            case 1 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                System.out.print("Dime el límite superior: ");
                int upper = in.nextInt();
                System.out
                        .println(blue + "Todos lo múltiplos entre " + num + " y " + upper + " son: " + resetColor
                                + multiples(num, upper));

                System.out.println();
            }

            case 2 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                System.out.println(blue + "El siguiente número primo es: " + resetColor + nextPrime(num));

                System.out.println();

            }

            case 3 -> {
                System.out.println("Dime un texto: ");
                String text = in.nextLine();
                vowelsUpperCase(text);

                System.out.println();
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            default -> {
                System.out.println(red + "Invalid option" + resetColor);
                System.out.println();
            }
        }

    }

    static List<Integer> multiples(int num, int upper) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = num; i <= upper; i += num) {
            multiples.add(i);
        }
        return multiples;
    }

    static boolean isPrime(int num) {
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

    static int nextPrime(int num) {
        num++;
        while (isPrime(num) == false) {
            num++;
        }
        return num;
    }

    static void vowelsUpperCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            char vowel = text.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                System.out.print(Character.toUpperCase(vowel));

            } else {
                System.out.print(text.charAt(i));
            }
        }
    }

}
