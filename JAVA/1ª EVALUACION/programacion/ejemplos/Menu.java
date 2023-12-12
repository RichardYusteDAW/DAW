import java.util.Scanner;

public class Menu {
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
                selectMenu(op);
            }

        } while (op != 0);

        in.close();
    }

    static void showMenu() {
        String menu = "1.- Mostrar números pares hasta el 100\n" +
                "2.- Mostrar números pares hasta un número introducido por el usuario\n" +
                "3.- Listar mayores de edad\n" +
                "4.- Matriz\n" +
                "5.- Cifrar texto\n" +
                "6.- Superhéroes\n" +
                "0.- Salir\n" +
                "--------------------\n" +
                "Opcion: ";

        System.out.println(menu);
    }

    static void selectMenu(int op) {
        switch (op) {
            case 1 -> {
                System.out.println(blue + "Opción1" + resetColor);
                System.out.println();
            }

            case 2 -> {
                System.out.println(blue + "Opción2" + resetColor);
                System.out.println();
            }

            case 3 -> {
                System.out.println(blue + "Opción3" + resetColor);
                System.out.println();
            }

            case 4 -> {
                System.out.println(blue + "Opción4" + resetColor);
                System.out.println();
            }

            case 5 -> {
                System.out.println(blue + "Opción5" + resetColor);
                System.out.println();
            }

            case 6 -> {
                System.out.println(blue + "Opción6" + resetColor);
                System.out.println();
            }

            default -> {
                System.out.println(red + "Inválid option" + resetColor);
                System.out.println();
            }
        }
    }
}
