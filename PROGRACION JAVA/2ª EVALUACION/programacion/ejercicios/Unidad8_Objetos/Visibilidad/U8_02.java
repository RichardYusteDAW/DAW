/*
Crea en la clase Coche un método llamado toString() que devuelva la frase:
“{marca} {modelo} de color {color} con número de bastidor {numeroBastidor}” 
(igual que antes, sustituyendo las variables por los valores reales del objeto).
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

public class U8_02 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Ford");
        car.setModel("Smax");
        car.setColor("Azul");
        car.setChassisNumber(1234567890);
        car.setSpeed(50);

        System.out.println(car); // No hace falta llamarlo así: System.out.println(car.toString());

    }
}

public class Car {
    private String brand, model, color;
    private int chassisNumber, speed = 0;

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

    @Override
    public String toString() {
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d", brand, model, color,
                chassisNumber);
    }
}
