package examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class examen {
    static String colorAzul = "\u001B[34m";
    static String resetColor = "\u001B[0m";
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            op = showMenu();
            ejecutar(op);
        } while (op != 0);

        in.close();
    }

    static int showMenu() {
        String menu = "1.- Mostrar números pares hasta el 100\n" +
                "2.- Mostrar números pares hasta un número introducido por el usuario\n" +
                "3.- Listar mayores de edad\n" +
                "4.- Matriz\n" +
                "5.- Cifrar texto\n" +
                "6.- Superhéroes\n" +
                "0.- Salir\n" +
                "--------------------\n" +
                "Opcion: ";

        int op;
        do {
            System.out.print(menu);
            op = in.nextInt();
        } while (op < 0 || op > 6);
        return op;
    }

    static void ejecutar(int op) {
        switch (op) {
            case 1 -> muestraPares();
            case 2 -> {
                System.out.print("Dime un numero: ");
                int fin = in.nextInt();
                muestraPares(fin);
            }
            case 3 -> listarMayores();
            case 4 -> mostarMatriz();
            case 5 -> {
                System.out.print("Dime el texto a cifrar: ");
                String text = in.next();
                cifrarTexto(text);
            }
            case 6 -> superheroes();
        }
    }

    static void muestraPares() {
        int fin = 100;
        for (int i = 0; i <= fin / 2; i++) {
            System.out.print(colorAzul + i * 2 + resetColor + " ");
            if (i == fin / 2) {
                System.out.println("\n");
            }
        }
    }

    static void muestraPares(int fin) {
        for (int i = 0; i <= fin / 2; i++) {
            System.out.print(colorAzul + i * 2 + resetColor + " ");
            if (i == fin / 2) {
                System.out.println("\n");
            }
        }
    }

    static void listarMayores() {
        Map<String, Integer> personas = new HashMap<>();
        personas = Map.of("Laura", 15, "Carlos", 16, "Paco", 17, "Luis", 18, "Maria", 19);

        System.out.print("Los mayores de edad son: ");
        for (String nombre : personas.keySet()) {
            int edad = personas.get(nombre);
            if (edad >= 18) {
                System.out.print(colorAzul + nombre + resetColor + " ");
            }
        }
        System.out.println("\n");
    }

    static int[][] crearMatriz() {
        int[][] matriz = new int[6][6];
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {// Abajo:
                    matriz[i][j] = aleatorio.nextInt(1,5) * 2;
                } else if (i > j) {// Arriba:
                    matriz[i][j] = aleatorio.nextInt(4) * 2 + 3;
                }
            }
            matriz[i][i] = 1;
        }
        return matriz;
    }

    static void mostarMatriz() {
        for (int[] row : crearMatriz()) {
            for (int cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void cifrarTexto(String text) {
        List<Character> abc = new ArrayList<>();
        abc = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z');

        int position;
        char newCharacter;
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            position = abc.indexOf(text.charAt(i)) + 3;
            newCharacter = abc.get(position);
            encryptedText += newCharacter;
        }
        System.out.println("El texto cifrado es: " + colorAzul + encryptedText + resetColor + "\n");

        // String texto = "Hola";
        // for (int i = 0; i < texto.length(); i++) {
        // System.out.print((char) ((texto.charAt(i) - 'a' + 3) % 26 + 'a'));
        // }
    }

    static void superheroes() {
        String menu = "1.- Alidado\n" +
                "2.- Enemigo\n" +
                "0.- Salir\n" +
                "--------------------\n" +
                "Opcion: ";
        int op;
        String aliado;
        String enemigo;
        List<String> aliados = new ArrayList<>();
        List<String> enemigos = new ArrayList<>();
        do {
            System.out.print(menu);
            op = in.nextInt();
            if (op == 1) {
                System.out.print("Dime tu aliado: ");
                aliado = in.next();
                aliados.add(aliado);
            } else if (op == 2) {
                System.out.print("Dime tu enemigo: ");
                enemigo = in.next();
                enemigos.add(enemigo);
            }
        } while (op != 0);

        System.out.print("Tus aliados son: ");
        for (String a : aliados) {
            System.out.print(colorAzul + a + " " + resetColor);
        }
        System.out.println();
        System.out.print("Tus enemigos son: ");
        for (String e : enemigos) {
            System.out.print(colorAzul + e + " " + resetColor);
        }
        System.out.println("\n");
    }
}