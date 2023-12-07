/*
Crea una nueva clase llamada Flota. 
Esta clase tendrá una propiedad que será un listado de coches. 
Crea un método para añadir un coche al listado y otro para eliminarlo. 
Al primer método se le pasará un objeto de tipo Coche y al segundo un número de bastidor.

Crea un último método que muestre por pantalla el listado de coches de la flota.

Añade 3 coches diferentes, muestra el listado, elimina uno de los coches y vuelve a mostrar el listado de coches que quedan en la flota. 
*/
package ejercicios.Unidad8_Objetos.Clases_y_objetos;

import java.util.ArrayList;
import java.util.List;

public class U8_05 {
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
        fleet.showCars();

        fleet.removeCar(33333);
        fleet.showCars();
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

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", brand, model, color,
                chassisNumber);
    }
}

public class Fleet {
    public List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int chassisNumber) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (chassisNumber == car.chassisNumber) {
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