package pruebas;

public class Kia {

    KiaModel model;

    public Kia(KiaModel model) {
        this.model = model;
    }

    public String toString() {
        return "Kia: " + this.model + "\nMotor: " + this.model.getEngine();
    }
}
