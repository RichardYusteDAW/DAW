/*
Haz que el método anterior devuelva false si el conductor no tiene asignado ningún coche, 
y usa el método para mostrar por pantalla:
“Este conductor no tiene asignado ningún coche” 
si se intenta eliminar un coche a un conductor que no tiene asignado ninguno.
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

import java.util.ArrayList;
import java.util.List;

public class U8_11 {
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

        Driver driver3 = new Driver("Paco");
        driver3.showAssignedCar();
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
                    car.getBrand(), car.getColor(), car.getChassisNumber()));
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
        } else {
            assignedCar = null;
        }
    }

    public void showAssignedCar() {
        if (assignedCar == null) {
            System.out.println(String.format("%s no tiene asignado ningún coche", name));
        } else {
            System.out.println(String.format("Coche asignado a %s %s", name, assignedCar.toString()));
        }
    }

    public boolean removeCar() {
        if (assignedCar == null) {
            System.out.println(String.format("%s no tiene asignado ningún coche", name));
            return false;
        } else {
            assignedCar = null;
            return true;
        }
    }
}
