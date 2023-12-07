/*
Crea una nueva clase llamada Conductor. 
Esta clase tendrá como atributos String nombre, el nombre del conductor, y Coche asignado, el coche que ha sido asignado al conductor.

Crea un método donde se le pasará un numero de bastidor y una flota de vehículos. 
El método comprobará que el coche con ese número de bastidor existe en esa flota y se lo asignará al conductor. 
Para buscar el coche en la flota, crea un método nuevo en la clase Flota que recibirá un número de bastidor 
y devolverá el objeto coche si lo encuentra o null en caso contrario.

Crea otro método que muestre el coche asignado al conductor con la frase:
“Coche asignado a {nombre}: {coche}”.
En tu clase principal, crea 2 conductores, asígnale uno de los coches a uno de los conductores 
y muestra por pantalla el coche asignado al conductor.
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

import java.util.ArrayList;
import java.util.List;

public class U8_08 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Smax", "Azul", 11111);
        Car car2 = new Car("Seat", "Ibiza", "Rojo", 22222);
        Car car3 = new Car("Ford", "Smax", "Azul", 33333);

        Fleet fleet = new Fleet();
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        System.out.println(fleet);

        int chassisNumber = 44444;
        if (fleet.removeCar(chassisNumber)) {
            System.out.println("Se ha eliminado el coche con número de bastidor: " + chassisNumber);
        } else {
            System.out.println("No existe ningún coche con número de bastidor " + chassisNumber);
        }
        System.out.println(fleet);

        Driver driver1 = new Driver("Juan");
        driver1.assignedCar(11111, fleet);
        driver1.showAssignedCar();

        Driver driver2 = new Driver("Pepe");
        driver2.assignedCar(22222, fleet);
        driver2.showAssignedCar();

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
        return String.format("es un %s %s de color %s con número de bastidor %d", brand, model, color, chassisNumber);
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

    public Car searchCar(int chassisNumber) {
        for (Car car : cars) {
            if (car.getChassisNumber() == chassisNumber) {
                return car;
            }
        }
        return null;
    }
}

public class Driver {
    private String name;
    private Car assignedCar;

    Driver(String name) {
        this.name = name;
    }

    public void assignedCar(int chassisNumber, Fleet fleet) {
        if (fleet.searchCar(chassisNumber) != null) {
            assignedCar = fleet.searchCar(chassisNumber);
        }
    }

    public void showAssignedCar() {
        System.out.println(String.format("Coche asignado a %s %s", name, assignedCar.toString()));
    }
}
