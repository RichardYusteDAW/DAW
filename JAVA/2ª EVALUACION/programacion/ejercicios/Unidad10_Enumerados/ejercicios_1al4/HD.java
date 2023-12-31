package ejercicios.Unidad10_Enumerados.ejercicios_1al4;

public class HD {
    private HD_Type type;
    private int capacity;

    public HD(HD_Type type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void setType(HD_Type type) {
        this.type = type;
    }

    public HD_Type getType() {
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
