/*
Crea un nuevo proyecto Java.
Además de la clase principal (puedes llamarla Main o App),
crea una nueva clase llamada Coche con los atributos marca, modelo, color, numeroBastidor y velocidad.
Los 3 primeros serán String y los dos últimos de tipo int. La velocidad inicial será de 0.

En la clase principal, crea un nuevo coche, asígnale valores a sus atributos y muestra por pantalla la frase:
“Mi coche es un {marca} {modelo} de color {color} con número de bastidor {numeroBastidor}”,
sustituyendo las variables encerradas entre llaves por los valores que le hayas dado a las propiedades al crear el coche.
 */
package ejercicios.Unidad8_Objetos.Visibilidad;

public class U8_01 {

    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Ford");
        car.setModel("Smax");
        car.setColor("Azul");
        car.setChassisNumber(1234567890);
        car.setSpeed(50);

        System.out.printf("Mi coche es un %s %s de color %s con número de bastidor %d", car.getBrand(), car.getModel(),
                car.getColor(), car.getChassisNumber());

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

}