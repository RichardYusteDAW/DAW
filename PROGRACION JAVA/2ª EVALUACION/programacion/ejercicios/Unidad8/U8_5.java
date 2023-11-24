package ejercicios.Unidad8;

import java.util.ArrayList;
import java.util.List;

public class U8_5 {
    public static void main(String[] args) {
        Car car = new Car();

        car.marca="Ford";
        car.modelo="Smax";
        car.color="Azul";
        car.numeroBastidor=1234567890;
        car.velocidad=50;

        car.increaseSpeed(10);
        System.out.println("La velocidad del car es " + car.velocidad);
        car.reduceSpeed(20);
        System.out.println("La velocidad del car es " + car.velocidad);

    }
}

public class Car {
    public String marca, modelo, color;
    public int numeroBastidor, velocidad=0;

    public void increaseSpeed(int increase){
        velocidad += increase;
    }
    public void reduceSpeed(int decrement){
        velocidad -= decrement;
    }
}

public class Flota {
    public List<Car> cars = new ArrayList<>();
    
    public void addCar(Car car){
        cars.add(car);
    }
    
    public void removeCar(int numeroBastidor){
        cars.remove(numeroBastidor);
    }

}
