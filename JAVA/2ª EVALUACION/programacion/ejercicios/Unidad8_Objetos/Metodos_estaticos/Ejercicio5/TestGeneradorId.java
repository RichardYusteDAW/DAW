package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio5;

public class TestGeneradorId {
    public static void main(String[] args) {
        GeneradorId generador = GeneradorId.getInstance();
        System.out.println(generador.getUuid());
        System.out.println(generador.getUuid());
        System.out.println(generador.getUuid());
    }
}