package ejercicios.Unidad8;

public class U8_1 {

    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        System.out.printf("Mi coche es un %s %s de color %s con número de bastidor %d", car.brand, car.model,
                car.color, car.chassisNumber);

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;
}