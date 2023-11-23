package ejercicios.Unidad8;

public class U8_4 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        car.increaseSpeed(10);
        System.out.println("La velocidad del coche es " + car.speed);
        car.reduceSpeed(20);
        System.out.println("La velocidad del coche es " + car.speed);

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;

    public void increaseSpeed(int increase) {
        speed += increase;
    }

    public void reduceSpeed(int decrement) {
        speed -= decrement;
    }
}
