package pruebas;

public class Car {
    private String marca, modelo;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void showDetails() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
    }
}