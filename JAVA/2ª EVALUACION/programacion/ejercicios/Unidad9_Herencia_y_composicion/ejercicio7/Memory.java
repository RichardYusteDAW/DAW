package ejercicios.Unidad9_Herencia_y_composicion.ejercicio7;

public class Memory {
    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}
