/*
Modifica el método eliminarCoche() anterior para que devuelva false en caso de no encontrar el coche con ese número de bastidor en la flota. 
A la hora de eliminar un coche desde la clase principal, muestra por pantalla la frase:
“No se encuentra el coche en la flota” si no existe un coche con ese número de bastidor.
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U8_06 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Smax", "Azul", 11111);
        Car car2 = new Car("Seat", "Ibiza", "Rojo", 22222);
        Car car3 = new Car("Ford", "Smax", "Azul", 33333);

        Fleet fleet = new Fleet();
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        System.out.println(fleet);

        Scanner in = new Scanner(System.in);
        System.out.print("Dime el número de bastidor: ");
        int chassisNumber = in.nextInt();
        if (fleet.removeCar(chassisNumber)) {
            System.out.println("Se ha eliminado el coche con número de bastidor: " + chassisNumber);
        } else {
            System.out.println("No existe ningún coche con número de bastidor " + chassisNumber);
        }
        System.out.println(fleet);

        in.close();
    }
}

public class Car {
    private String brand, model, color;
    private int chassisNumber, speed = 0;

    Car(String brand, String model, String color, int chassisNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.chassisNumber = chassisNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChassisNumber() {
        return this.chassisNumber;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int increase) {
        speed += increase;
    }

    public void reduceSpeed(int decrement) {
        speed -= decrement;
    }
}

public class Fleet {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public boolean removeCar(int chassisNumber) {
        int foundCars = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (chassisNumber == cars.get(i).getChassisNumber()) {
                cars.remove(cars.get(i));
                foundCars++;
            }
        }
        return (foundCars == 0) ? false : true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Car car : cars) {
            builder.append(String.format("El car %s %s es de color %s con número de bastidor %d\n", car.getBrand(),
                    car.getModel(), car.getColor(), car.getChassisNumber()));
        }
        return builder.toString();
    }

}
