package pruebas;

public class Car {
    public String marca, modelo;
    public int chassisNumber;

    public Car(String marca, String modelo, int chassisNumber) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassisNumber = chassisNumber;
    }

    public void showDetails() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.chassisNumber);
    }
}