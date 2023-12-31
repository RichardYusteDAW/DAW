package ejercicios.Unidad10_Enumerados.ejercicios_1al4;

public class Computer extends Product {
    private Memory memory;
    private CPU cpu;
    private HD hd;

    public Computer(int id, float price, Memory memory, CPU cpu, HD hd) {
        super(id, price);
        this.memory = memory;
        this.cpu = cpu;
        this.hd = hd;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public HD getHd() {
        return hd;
    }

    @Override
    public String toString() {
        return "Computer{" + memory + " " + cpu + " " + hd + '}';
    }
}
