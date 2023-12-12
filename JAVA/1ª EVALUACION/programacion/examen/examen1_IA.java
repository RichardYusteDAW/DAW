package examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class examen1_IA {
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
        String[] menu = { "Factorial", "Primes menores", "Cifrado Cesar", "Tabla de multiplicar",
                "Operaciones matemáticas", "Número mayor", "Divisible por 2, 3, 5 o 7", "Palíndromo", "Primes",
                "Número de aes", "Número de palabras", "Número de caracteres", "Primera y última letra",
                "Longitud de la cadena", "Cadena en mayúsculas", "Cadena en minúsculas", "Cadena sin espacios",
                "Mayúsculas o minúsculas", "Reemplazar caracteres" };

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    static void selectMenu(int op) {
        switch (op) {
            case 1 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                System.out.println(blue + "El factorial de " + num + " es " + resetColor + factorial(num));
                System.out.println();
            }

            case 2 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                System.out.print(blue + "Los números primos menores que " + num + " son: " + resetColor);
                for (int prime : minorPrimes(num)) {
                    System.out.print(prime + " ");
                }
                System.out.println("\n");
            }

            case 3 -> {
                System.out.print("Dime una palabra: ");
                cesarCipher(in.next());
                System.out.println("\n");
            }

            case 4 -> {
                System.out.print("Dime un número del 1 al 10: ");
                mutliTable(in.nextInt());
                System.out.println("\n");
            }

            case 5 -> {
                System.out.print("Dime un número: ");
                int num1 = in.nextInt();
                System.out.print("Dime otro número: ");
                int num2 = in.nextInt();
                mathOps(num1, num2);
                System.out.println("\n");
            }

            case 6 -> {
                System.out.print("Dime un número: ");
                int num1 = in.nextInt();
                System.out.print("Dime otro número: ");
                int num2 = in.nextInt();
                System.out.print("Dime el último número: ");
                int num3 = in.nextInt();
                System.out.println(
                        blue + "El mayor de los tres números es: " + resetColor + greaterThan(num1, num2, num3));
                System.out.println("\n");
            }

            case 7 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                if (divisible(num)) {
                    System.out.println(num + blue + " es divisible entre 2, 3, 5 y 7" + resetColor);
                } else {
                    System.out.println(num + blue + " NO es divisible entre 2, 3, 5 y 7" + resetColor);
                }
                System.out.println("\n");
            }

            case 8 -> {
                System.out.print("Dime una palabra: ");
                String text = in.next();
                if (palindrome(text)) {
                    System.out.println(blue + "La palabra " + resetColor + text + blue + " es palíndroma" + resetColor);
                } else {
                    System.out.println(
                            blue + "La palabra " + resetColor + text + blue + " NO es palíndroma" + resetColor);
                }
                System.out.println("\n");
            }

            case 9 -> {
                System.out.print("Dime un número: ");
                int num = in.nextInt();
                if (prime(num)) {
                    System.out.println(num + blue + " es primo" + resetColor);
                } else {
                    System.out.println(num + blue + " NO es primo" + resetColor);
                }
                System.out.println("\n");
            }

            case 10 -> {
                System.out.print("Dime una palabra: ");
                String text = in.next();
                System.out.println(blue + text + " tiene " + resetColor + length(text) + blue + " aes" + resetColor);

                System.out.println("\n");
            }

            case 11 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(
                        blue + text + " tiene " + resetColor + words(text) + blue + " palabras" + resetColor);

                System.out.println("\n");
            }

            case 12 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(
                        blue + text + " tiene " + resetColor + numChars(text) + blue + " caracteres contando espacios"
                                + resetColor);

                System.out.println();
            }

            case 13 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(blue + "La primera letra es: " + resetColor + firstLastChars(text).get("first"));
                System.out.println(blue + "La última letra es: " + resetColor + firstLastChars(text).get("last"));

                System.out.println();
            }
            case 14 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(blue + "El texto: " + text + " tiene " + resetColor + letters(text) + blue
                        + " caracteres sin espacios" + resetColor);

                System.out.println();
            }
            case 15 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(blue + upperCase(text) + resetColor);

                System.out.println();
            }
            case 16 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(blue + lowerCase(text) + resetColor);

                System.out.println();
            }
            case 17 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.println(blue + withOutSpace(text) + resetColor);

                System.out.println();
            }
            case 18 -> {
                System.out.print("Dime una frase: ");
                String text = in.nextLine();
                System.out.print("¿Qué letra quieres cambiar? ");
                String letter1 = in.nextLine();
                System.out.print("¿Por qué letra la quieres cambiar? ");
                String letter2 = in.nextLine();

                System.out.println(blue + replace(text, letter1, letter2) + resetColor);

                System.out.println();
            }
            default -> {
                System.out.println(red + "Invalid option" + resetColor);
                System.out.println();
            }
        }

    }

    static int factorial(int num) {
        int i = num - 1;
        int factorial = num;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        return factorial;
    }

    static List<Integer> minorPrimes(int num) {
        List<Integer> primes = new ArrayList<>();

        boolean prime;
        for (int i = 2; i <= num; i++) {
            prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes.add(i);
            }
        }
        return primes;
    }

    static void cesarCipher(String text) {
        System.out.print(blue + "El cifrado cesar de " + text + " es: " + resetColor);
        for (int i = 0; i < text.length(); i++) {
            System.out.print((char) ((text.charAt(i) - 'a' + 3) % 26 + 'a'));
        }
    }

    static void mutliTable(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(blue + num + "*" + i + "=" + resetColor + i * num);
        }
    }

    static void mathOps(int num1, int num2) {
        System.out.println(blue + num1 + " + " + num2 + " = " + resetColor + (num1 + num2));
        System.out.println(blue + num1 + " - " + num2 + " = " + resetColor + (num1 - num2));
        System.out.println(blue + num1 + " * " + num2 + " = " + resetColor + num1 * num2);
        System.out.println(blue + num1 + " / " + num2 + " = " + resetColor + (float) num1 / (float) num2);
    }

    static int greaterThan(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            return num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            return num2;
        } else {
            return num3;
        }
    }

    static boolean divisible(int num) {
        if ((num % 2 == 0) && (num % 3 == 0) && (num % 5 == 0) && (num % 7 == 0)) {
            return true;
        }
        return false;
    }

    static boolean palindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
        // reconocer es la palabra palíndroma más larga que existe.
    }

    static boolean prime(int num) {
        if (num <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int length(String text) {
        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                num++;
            }
        }
        return num;
    }

    static int words(String text) {
        return text.split("\\s+").length;
    }

    static int numChars(String text) {
        return text.length();
    }

    static Map<String, Character> firstLastChars(String text) {
        Map<String, Character> position = new HashMap<>();
        position.put("first", text.charAt(0));
        position.put("last", text.charAt(text.length() - 1));

        return position;
    }

    static int letters(String text) {
        int letters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                letters++;
            }
        }
        return letters;
    }

    static String upperCase(String text) {
        return text.toUpperCase();
    }

    static String lowerCase(String text) {
        return text.toLowerCase();
    }

    static String withOutSpace(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                newText = newText.concat(String.valueOf(text.charAt(i)));
            }
        }
        return newText;
    }

    static String replace(String text, String leter1, String letter2) {
        return text.replace(leter1, letter2);
    }

}
