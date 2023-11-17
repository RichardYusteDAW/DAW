/*Escribe un programa en Java con una constante de tipo String con el valor: "    hola mundo    "
Haz que se muestre por pantalla la frase en mayúsculas 
y sin espacios en blanco al principio y final de la cadena.*/
package ejercicios.Unidad4;

public class U4_4 {
    public static void main(String[] args) {
        final String saludo = "    hola mundo    ";
        String saludoModificado = saludo.substring(4, 15).toUpperCase();
        String saludoModificado2 = saludo.trim().toUpperCase(); // Se podría hacer así también.

        System.out.println(saludoModificado);
        System.out.println(saludoModificado2);
    }
}