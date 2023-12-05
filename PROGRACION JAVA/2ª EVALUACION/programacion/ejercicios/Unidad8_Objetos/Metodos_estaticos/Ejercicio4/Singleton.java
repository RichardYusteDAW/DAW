/*
Crea una propiedad privada en la clase anterior (Singleton) llamada contador con valor inicial = 0. 
Crea un método llamado checkInstance() que devuelva la frase “Instancia creada. Contador: {contador}”.

Comprueba que siempre que se llama al método checkInstance() después de usar getInstance() devuelve siempre la frase:
“Instancia creada. Contador: 0”.
*/
package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio4;

public class Singleton {

    private static Singleton instance;
    private static int contador = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void checkInstance() {
        System.out.println("Instancia creada. Contador: " + contador);
    }
}
