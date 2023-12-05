/*
Uno de los problemas de crear IDs autoincrementativos en una base de datos es que, 
al ser secuenciales, nos pueden leer todos los datos con un robot haciendo peticiones a los recursos con IDs sucesivas. 
Una posible solución es utilizar identificadores únicos universales. 
De esta forma, nuestros IDs no son secuenciales, con lo que no es tan fácil leer nuestros datos de forma automática.

Crea la clase GeneradorId. 
La clase debe seguir el patrón Singleton visto anteriormente (solo debe permitir crear una instancia). 
En el constructor (recuerda que es privado) se generará un ID aleatorio mediante el método randomUUIID() de la clase UUID.

Crea un nuevo método getUuid(), que deberá generar un nuevo ID aleatorio y devolverlo. 
Usa varias veces el método para comprobar (llamando antes siempre al método que recupera la instancia) 
que devuelve un ID diferente cada vez.
*/
package ejercicios.Unidad8_Objetos.Metodos_estaticos.Ejercicio5;

import java.util.UUID;

public class GeneradorId {

    private static GeneradorId instance;

    private GeneradorId() {
    }

    public static GeneradorId getInstance() {
        if (instance == null) {
            instance = new GeneradorId();
        }

        return instance;
    }

    public UUID getUuid() {
        return UUID.randomUUID();
    }
}
