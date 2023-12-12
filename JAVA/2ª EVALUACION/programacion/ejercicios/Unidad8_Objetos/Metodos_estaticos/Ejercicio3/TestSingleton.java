package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio3;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        System.out.println(singletonInstance1);
        System.out.println(singletonInstance2);
    }
}