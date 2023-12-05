package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio4;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.checkInstance();
        singleton2.checkInstance();
    }
}