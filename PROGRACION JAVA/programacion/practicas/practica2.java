import java.util.Scanner;

public class practica2 {
    static Scanner in = new Scanner(System.in);
    static final String USUARIO = "usuario";
    static final String ADMIN = "admin";

    public static void main(String[] args) {
        buildMainMenu(checkUser());
        in.close();
    }
    
    static int checkUser() {
        System.out.print("Login: ");
        String user = in.nextLine();
        System.out.print("Password: ");
        String pass = in.nextLine();
        boolean checkAdmin = user.equals(ADMIN) && pass.equals(ADMIN);
        boolean checkUser = user.equals(USUARIO) && pass.equals(USUARIO);
        
        if (checkAdmin == false && checkUser == false) {
            return -1;
        } else if (checkAdmin = user.equals(ADMIN) && pass.equals(ADMIN)) {
            return 0;
        } else {
            return 1;
        }
    };
    
    static int i=1;
    static void buildMainMenu(int checkUser) {
        if (checkUser == 0) {
            buildAdminMenu();
        } else if (checkUser == 1) {
            buildUserMenu();
        } else {
            while (i<3) {
                System.out.println("Invalid credentials");
                i++;
                buildMainMenu(checkUser());
            }
        }
    };

    static void buildUserMenu(){
        String userMenu =   "1.- Películas\n" +
                            "2.- Configuración usuario\n" +
                            "0.- Salir\n" +
                            "--------------------\n" +
                            "Opción: ";
        String userMenu1 =  "1.- Casablanca\n" +
                            "2.- El padrino\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
        String userMenu2 =  "1.- Cambiar nombre usuario\n" +
                            "2.- Cambiar password\n" +
                            "0.- Volver\n" +
                            "--------------------\n" +
                            "Opción: ";
        int op;
        do {
            System.out.println(userMenu);
            op = in.nextInt();
            int op2;
            switch (op) {
                case 1:
                    do {
                        System.out.print(userMenu1);
                        op2 = in.nextInt();
                    } while (op2 != 0);
                    break;
                case 2:
                    do {
                        System.out.print(userMenu2);
                        op2 = in.nextInt();

                    } while (op2 != 0);
                    break;
            }
        } while (op != 0);
    }

    static void buildAdminMenu(){
        String adminMenu =  "1.- Administrar películas\n" +
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
            System.out.println(adminMenu);
            op = in.nextInt();
            int op2;
            switch (op) {
                case 1:
                    do {
                        System.out.print(adminMenu1);
                        op2 = in.nextInt();
                    } while (op2 != 0);
                    break;
                case 2:
                    do {
                        System.out.print(adminMenu2);
                        op2 = in.nextInt();
                    } while (op2 != 0);
                    break;
            }
        } while (op != 0);
    }
}