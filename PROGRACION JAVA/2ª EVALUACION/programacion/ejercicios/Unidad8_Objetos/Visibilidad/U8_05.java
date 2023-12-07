/*
Crea una nueva clase llamada Flota. 
Esta clase tendrá una propiedad que será un listado de coches. 
Crea un método para añadir un coche al listado y otro para eliminarlo. 
Al primer método se le pasará un objeto de tipo Coche y al segundo un número de bastidor.

Crea un último método que muestre por pantalla el listado de coches de la flota.

Añade 3 coches diferentes, muestra el listado, elimina uno de los coches y vuelve a mostrar el listado de coches que quedan en la flota. 
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

import java.util.ArrayList;
import java.util.List;

public class U8_05 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Smax", "Azul", 11111);
        Car car2 = new Car("Seat", "Ibiza", "Rojo", 22222);
        Car car3 = new Car("Ford", "Smax", "Azul", 33333);

        Fleet fleet = new Fleet();
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.showCars();

        fleet.removeCar(33333);
        fleet.showCars();
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

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", brand, model, color,
                chassisNumber);
    }
}

public class Fleet {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int chassisNumber) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (chassisNumber == car.getChassisNumber()) {
                cars.remove(car);
            }
        }
    }

    public void showCars() {
        for (Car car : cars) {
            System.out.println(car); // Se podría poner así: System.out.println(car.toString());
        }
    }

}