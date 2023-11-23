package ejercicios.Unidad8;

public class U8_2 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        System.out.println(car.toString());

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", brand, model, color,
                chassisNumber);
    }
}
