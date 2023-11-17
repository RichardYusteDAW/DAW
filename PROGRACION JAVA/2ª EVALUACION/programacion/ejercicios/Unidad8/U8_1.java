package ejercicios.Unidad8;

public class U8_1 {

    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca="Ford";
        coche.modelo="Smax";
        coche.color="Azul";
        coche.numeroBastidor=1234567890;
        coche.velocidad=50;

        System.out.printf("Mi coche es un %s %s de color %s con número de bastidor %d",coche.marca,coche.modelo,coche.color,coche.numeroBastidor);

    }
}


public class Coche {
    public String marca, modelo, color;
    public int numeroBastidor, velocidad=0;
}