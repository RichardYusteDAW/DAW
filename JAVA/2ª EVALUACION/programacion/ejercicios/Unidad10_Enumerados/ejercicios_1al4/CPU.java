package ejercicios.Unidad10_Enumerados.ejercicios_1al4;

public class CPU {
    private CPU_Types model;

    public CPU(CPU_Types model) {
        this.model = model;
    }

    public void setModel(CPU_Types model) {
        this.model = model;
    }

    public CPU_Types getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", speed=" + model.getSpeed() +
                ", threads=" + model.getThreads() +
                '}';
    }
}
