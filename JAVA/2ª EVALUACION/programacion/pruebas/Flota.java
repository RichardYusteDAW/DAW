package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    List<Car> cars;

    public Flota() {
        cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int chassisNumber) {
        for (Car car : cars) {
            if (car.chassisNumber == chassisNumber) {
                cars.remove(car);
                break;
            }
        }
    }
}
