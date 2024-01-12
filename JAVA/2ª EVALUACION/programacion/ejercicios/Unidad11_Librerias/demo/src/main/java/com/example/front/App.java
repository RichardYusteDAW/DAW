package com.example.front;

import java.util.Scanner;

import com.example.back.controller.CustomerController;

public class App {
    public static void main(String[] args) {
        String blue = "\u001B[34m";
        String red = "\u001B[31m";
        String resetColor = "\u001B[0m";

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            Menu.show();
            op = sc.nextInt();

            switch (op) {
                case 1 -> request();
                case 2 -> {
                    System.out.print("Introduce el ID del cliente: ");
                    int id = sc.nextInt();
                    System.out.println(CustomerController.findById(id));
                }

                case 0 -> System.out.println(blue + "Saliendo..." + resetColor);
                default -> System.out.println(red + "404 .- Recurso no encontrado\n" + resetColor);
            }
        } while (op != 0);

        sc.close();
    }

    private static void request() {
        com.example.back.App.response();
    }
}