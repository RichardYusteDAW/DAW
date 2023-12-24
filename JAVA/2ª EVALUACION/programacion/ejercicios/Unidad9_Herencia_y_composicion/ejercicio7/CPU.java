package ejercicios.Unidad9_Herencia_y_composicion.ejercicio7;

public class CPU {
    private String model;
    private int speed;

    public CPU(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
