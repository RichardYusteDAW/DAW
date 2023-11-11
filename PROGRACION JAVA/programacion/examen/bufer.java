package examen;

import java.util.Scanner;

public class bufer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dime un num: ");
        int num = in.nextInt();
        in.nextLine();

        System.out.print("Dime una frase: ");
        String text = in.nextLine();

        System.out.println(num);
        System.out.println(text);

        in.close();
    }

}
