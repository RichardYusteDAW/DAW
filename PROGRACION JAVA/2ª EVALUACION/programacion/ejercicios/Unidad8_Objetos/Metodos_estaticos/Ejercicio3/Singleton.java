/*
Uno de los patrones más útiles en programación es el patrón Singleton. 
Sirve para crear una sola instancia (un solo objeto) de una clase. 
Crea la clase Singleton con una propiedad privada llamada instancia de tipo de la misma clase (Singleton). 
Declara el constructor de la clase como private (con lo que no se pueden crear objetos de dicha clase).

Crea un método en la clase llamado getInstance(). 
Este método comprobará si la propiedad instance en null. Si es así (es la primera vez que se accede al método), 
se creará un nuevo objeto de la misma clase y se le asignará a la propiedad instance. 
Si no es null, se devolverá la propiedad instance de la clase.

Comprueba que puedes crear objetos de la clase Singleton desde otra clase. 
*/
package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio3;

public class Singleton {
    
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
}
