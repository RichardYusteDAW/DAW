package ejercicios.Unidad8;


public class U8_2 {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca="Ford";
        coche.modelo="Smax";
        coche.color="Azul";
        coche.numeroBastidor=1234567890;
        coche.velocidad=50;

        System.out.println(coche.toString());

    }
}

public class Coche {
    public String marca, modelo, color;
    public int numeroBastidor, velocidad=0;

    @Override
    public String toString(){
        return String.format("Mi coche es un %s %s de color %s con número de bastidor %d",marca,modelo,color,numeroBastidor);
    }
}
