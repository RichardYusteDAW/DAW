package ejercicios.Unidad8;

public class U8_3 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        car.increaseSpeed();
        System.out.println("La velocidad del coche es " + car.speed);
        car.reduceSpeed();
        System.out.println("La velocidad del coche es " + car.speed);

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;

    public void increaseSpeed() {
        speed += 5;
    }

    public void reduceSpeed() {
        speed -= 5;
    }
}
