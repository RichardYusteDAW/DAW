package ejercicios.Unidad8;

import java.util.ArrayList;
import java.util.List;

public class U8_5b {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.marca = "Ford";
        coche1.modelo = "Smax";
        coche1.color = "Azul";
        coche1.numeroBastidor = 11111;

        coche2.marca = "Seat";
        coche2.modelo = "Ibiza";
        coche2.color = "Rojo";
        coche2.numeroBastidor = 22222;

        coche3.marca = "Ford";
        coche3.modelo = "Smax";
        coche3.color = "Azul";
        coche3.numeroBastidor = 33333;

        Flota flota = new Flota();
        flota.addCar(coche1);
        flota.addCar(coche2);
        flota.addCar(coche3);
        System.out.println(flota);

        flota.removeCar(33333);
        System.out.println(flota);
    }
}

public class Coche {
    public String marca, modelo, color;
    public int numeroBastidor, velocidad = 0;

    public void increaseSpeed(int increase) {
        velocidad += increase;
    }

    public void reduceSpeed(int decrement) {
        velocidad -= decrement;
    }

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", marca, modelo, color,
                numeroBastidor);
    }
}

public class Flota {
    public List<Coche> coches = new ArrayList<>();

    public void addCar(Coche coche) {
        coches.add(coche);
    }

    public void removeCar(int numeroBastidor) {
        for (int i = 0; i < coches.size(); i++) {
            if (numeroBastidor == coches.get(i).numeroBastidor) {
                coches.remove(coches.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Coche coche : coches) {
            builder.append(String.format("El coche %s %s es de color %s con número de bastidor %d\n", coche.marca,
                    coche.modelo, coche.color, coche.numeroBastidor));
        }
        return builder.toString();
    }

    public void showCars() {
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }

}
