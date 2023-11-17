package ejercicios.Unidad8;


public class U8_4 {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca="Ford";
        coche.modelo="Smax";
        coche.color="Azul";
        coche.numeroBastidor=1234567890;
        coche.velocidad=50;

        coche.increaseSpeed(10);
        System.out.println("La velocidad del coche es " + coche.velocidad);
        coche.reduceSpeed(20);
        System.out.println("La velocidad del coche es " + coche.velocidad);

    }
}

public class Coche {
    public String marca, modelo, color;
    public int numeroBastidor, velocidad=0;

    public void increaseSpeed(int increase){
        velocidad += increase;
    }
    public void reduceSpeed(int decrement){
        velocidad -= decrement;
    }
}
