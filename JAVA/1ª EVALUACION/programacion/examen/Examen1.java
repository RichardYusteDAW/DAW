package examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Examen1 {
    static Scanner in = new Scanner(System.in);
    static String blue = "\u001B[34m";
    static String red = "\u001B[31m";
    static String resetColor = "\u001B[0m";

    public static void main(String[] args) {
        int op;
        do {
            showMenu();
            System.out.print("Dime un opción: ");
            op = in.nextInt();
            in.nextLine(); // limpia el búfer

            if (op != 0) {
                executeOption(op);
            }

        } while (op != 0);

        in.close();
    }

    static void showMenu() {
        String menu = "1.- Mostrar números primos del 1 al 100\n" +
                "2.- Contar una letra en una frase\n" +
                "3.- Dibujar cara\n" +
                "4.- Palabras B/V\n" +
                "5.- Contar herrramientas\n" +
                "0.- Salir\n" +
                "--------------------\n" +
                "Escribe una opción: ";

        System.out.println(menu);
    }

    static void executeOption(int op) {
        switch (op) {
            case 1 -> {
                System.out.println("Los primos del 1 al 100 son: " + blue + primos() + resetColor);
                System.out.println();
            }

            case 2 -> {
                System.out.println("La letra aparece: " + blue + contarLetras() + " veces" + resetColor);
                System.out.println();
            }

            case 3 -> {
                System.out.println("1 - contento, 2 - triste");
                int resp = in.nextInt();
                dibujarCara(resp);
                System.out.println();
            }

            case 4 -> {
                primeraLetraB_V();
                System.out.println();
            }

            case 5 -> {
                contarHerramientas();
                System.out.println();
            }

            default -> {
                System.out.println(red + "Inválid option" + resetColor);
                System.out.println();
            }
        }
    }

    public static List<Integer> primos() {
        List<Integer> primos = new ArrayList<>();
        boolean primo;
        for (int i = 1; i <= 100; i++) {
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
        return primos;
    }

    public static int contarLetras() {
        System.out.print("Dime una frase: ");
        String frase = in.nextLine();
        System.out.print("Dime una letra: ");
        char letra = in.next().charAt(0);

        int numeroApariciones = 0;
        for (char c : frase.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                numeroApariciones++;
            }
        }

        return numeroApariciones; 
    }

    public static void dibujarCara(int resp) {
        String cara1 = blue + " 0  0 \n" +
                "\n" +
                "" +
                "x    x\n" +
                " xxxx " + resetColor;

        String cara2 = red + " 0  0 \n" +
                "\n" +
                "" +
                " xxxx \n" +
                "x    x" + resetColor;

        if (resp == 1) {
            System.out.println(cara1);
        } else if (resp == 2) {
            System.out.println(cara2);
        } else {
            System.out.println(red+ "Invalid option"+resetColor);
        }

        
    }

    public static void primeraLetraB_V() {
        String palabra;
        List<String> listaB = new ArrayList<>();
        List<String> listaV = new ArrayList<>();

        do {
            System.out.print("Dime una palabra que empiece por B o por V (*salir): ");
            palabra = in.nextLine();

            if (palabra.toLowerCase().charAt(0) == 'b') {
                listaB.add(palabra);
            }else if (palabra.toLowerCase().charAt(0) == 'v'){
                listaV.add(palabra);
            }
        } while (palabra.toLowerCase().equals("salir") == false);

        System.out.println("Las palabras que empiezan por B son: " + blue + listaB + resetColor);
        System.out.println("Las palabras que empiezan por V son: " + blue + listaV + resetColor);
    }

    public static void contarHerramientas() {
        String[] herramientas = {"martillo", "destornillador", "clavo", "martillo", "taladro", "martillo", "destornillador"};
        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : herramientas) {
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }

        for (String herramienta : contador.keySet()) { 
            System.out.println(blue + herramienta + ": " + contador.get(herramienta) + resetColor);
        }
    }
}
