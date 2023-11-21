package ejercicios.Unidad8;

import java.util.ArrayList;
import java.util.List;

public class U8_5 {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca="Ford";
        coche.modelo="Smax";
        coche.color="Azul";
        coche.numeroBastidor=1234567890;
        coche.velocidad=50;

        coche.increaseSpeed(10);
        System.out.println("La velocidad del coche es " + coche.velocidad);
        coche.reduceSpeed(20);
        System.out.println("La velocidad del coche es " + coche.velocidad);

    }
}

public class Coche {
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
    public List<Coche> coches = new ArrayList<>();
    
    public void addCar(Coche coche){
        coches.add(coche);
    }
    
    public void removeCar(int numeroBastidor){
        coches.remove(numeroBastidor);
    }

}
