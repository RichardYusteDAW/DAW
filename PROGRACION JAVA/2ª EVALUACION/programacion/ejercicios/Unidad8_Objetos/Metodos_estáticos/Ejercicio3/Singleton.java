package ejercicios.Unidad8_Objetos.Metodos_estáticos.Ejercicio3;

public class Singleton {
    // La única instancia de la clase Singleton, inicialmente null
    private static Singleton instance = null;

    // Constructor privado para prevenir la instanciación directa
    private Singleton() {
    }

    // Método público estático para obtener la instancia de la clase Singleton
    public static Singleton getInstance() {
        // Crea la instancia si no existe aún (la primera vez que se llama)
        if (instance == null) {
            instance = new Singleton();
        }
        // Devuelve la instancia existente
        return instance;
    }
}
