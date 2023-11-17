import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Login: ");
        final String user = in.nextLine();
        if (!user.equals("admin") && !user.equals("usuario")) {
            System.out.println("The user does not exist");
        } else {
            System.out.print("Password: ");
            final String pass = in.nextLine();
            boolean passAdmin = user.equals("admin") && pass.equals("admin");
            boolean passUser = user.equals("usuario") && pass.equals("usuario");
            if (passAdmin || passUser) {
                if (passUser) {
                    String userMenu = "1.- Películas\n" +
                            "2.- Configuración usuario\n" +
                            "0.- Salir\n" +
                            "--------------------\n" +
                            "Opción: ";
                    String userMenu1 = "1.- Casablanca\n" +
                            "2.- El padrino\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
                    String userMenu2 = "1.- Cambiar nombre usuario\n" +
                            "2.- Cambiar password\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
                    int op;
                    do {
                        System.out.print(userMenu);
                        op = in.nextInt();
                        switch (op) {
                            case 1:
                                do {
                                    System.out.print(userMenu1);
                                    op = in.nextInt();
                                    if (op == 0) {
                                        System.out.print(userMenu);
                                        op = in.nextInt();
                                    }
                                } while (op != 0);
                                break;
                            case 2:
                                do {
                                    System.out.print(userMenu2);
                                    op = in.nextInt();
                                    if (op == 0) {
                                        System.out.print(userMenu);
                                        op = in.nextInt();
                                    }
                                } while (op != 0);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.print(userMenu);
                                op = in.nextInt();
                        }
                    } while (op != 0);
                } else {
                    String adminMenu = "1.- Administrar películas\n" +
                            "2.- Administrar usuarios\n" +
                            "0.- Salir\n" +
                            "--------------------\n" +
                            "Opción: ";
                    String adminMenu1 = "1.- Añadir película\n" +
                            "2.- Modificar película\n" +
                            "3.- Borrar película\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
                    String adminMenu2 = "1.- Añadir usuario\n" +
                            "2.- Borrar  usuario\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
                    int op;
                    do {
                        System.out.print(adminMenu);
                        op = in.nextInt();
                        switch (op) {
                            case 1:
                                do {
                                    System.out.print(adminMenu1);
                                    op = in.nextInt();
                                    if (op == 0) {
                                        System.out.print(adminMenu);
                                        op = in.nextInt();
                                    }
                                } while (op != 0);
                                break;
                            case 2:
                                do {
                                    System.out.print(adminMenu2);
                                    op = in.nextInt();
                                    if (op == 0) {
                                        System.out.print(adminMenu);
                                        op = in.nextInt();
                                    }
                                } while (op != 0);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.print(adminMenu);
                                op = in.nextInt();
                        }
                    } while (op != 0);
                }
            } else {
                System.out.println("Invalid password");
            }
        }

        in.close();
    }
}