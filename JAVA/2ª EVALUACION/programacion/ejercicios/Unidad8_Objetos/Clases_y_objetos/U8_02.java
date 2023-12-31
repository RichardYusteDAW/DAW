/*
Crea en la clase Coche un método llamado toString() que devuelva la frase:
“{marca} {modelo} de color {color} con número de bastidor {numeroBastidor}” 
(igual que antes, sustituyendo las variables por los valores reales del objeto).
*/
package ejercicios.Unidad8_Objetos.Clases_y_objetos;

public class U8_02 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        System.out.println(car); // No hace falta llamarlo así: System.out.println(car.toString());

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", brand, model, color,
                chassisNumber);
    }
}