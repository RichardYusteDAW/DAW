/*Elimina el método que muestra por pantalla el listado de coches. 
En su lugar, añade el método toString() a Flota para devolver una cadena con el listado de coches que tiene la flota.
 */
package ejercicios.Unidad8_Objetos.Clases_y_objetos;

import java.util.ArrayList;
import java.util.List;

public class U8_05b {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Ford";
        car1.model = "Smax";
        car1.color = "Azul";
        car1.chassisNumber = 11111;

        car2.brand = "Seat";
        car2.model = "Ibiza";
        car2.color = "Rojo";
        car2.chassisNumber = 22222;

        car3.brand = "Ford";
        car3.model = "Smax";
        car3.color = "Azul";
        car3.chassisNumber = 33333;

        Fleet fleet = new Fleet();
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        System.out.println(fleet);

        fleet.removeCar(33333);
        System.out.println(fleet);
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

public class Fleet {
    public List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int chassisNumber) {
        for (int i = 0; i < cars.size(); i++) {
            if (chassisNumber == cars.get(i).chassisNumber) {
                cars.remove(cars.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Car car : cars) {
            builder.append(String.format("El car %s %s es de color %s con número de bastidor %d\n", car.brand,
                    car.model, car.color, car.chassisNumber));
        }
        return builder.toString();
    }

}
