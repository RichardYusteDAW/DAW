package ejercicios.Unidad9_Herencia_y_composicion.ejercicio7;

public class HD {
    private String type;
    private int capacity;

    public HD(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HD{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
