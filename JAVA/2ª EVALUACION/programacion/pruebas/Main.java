package pruebas;

public class Main {
    public static void main(String[] args) {
        Car cocheBorja = new Car("Ford", "Fiesta");

        // System.out.println(cocheBorja.marca);
        // System.out.println(cocheBorja.modelo);

        cocheBorja.showDetails();

        String name = "Zai";
        int age = 13;
        int hight = 170;

        System.out.println("Mi nombre es " + name + " y mi edad es " + age + " mido " + hight + " cms");

        int a = 2;
        int b = 3;
        saludar(a, b);
    }

    static void saludar(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
