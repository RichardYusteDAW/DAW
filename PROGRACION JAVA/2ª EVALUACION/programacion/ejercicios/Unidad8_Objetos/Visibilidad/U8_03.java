/*
Crea dos métodos en la clase Coche que permitan aumentar o reducir la velocidad del coche en 5. 
Utiliza ambos métodos por pantalla y muestra la velocidad para comprobar que funcionan correctamente. 
*/
package ejercicios.Unidad8_Objetos.Visibilidad;

public class U8_03 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Ford");
        car.setModel("Smax");
        car.setColor("Azul");
        car.setChassisNumber(1234567890);
        car.setSpeed(50);

        car.increaseSpeed();
        System.out.println("La velocidad del coche es " + car.getSpeed());
        car.reduceSpeed();
        System.out.println("La velocidad del coche es " + car.getSpeed());

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

    public void increaseSpeed() {
        speed += 5;
    }

    public void reduceSpeed() {
        speed -= 5;
    }
}
