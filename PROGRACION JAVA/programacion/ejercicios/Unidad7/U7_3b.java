/*Crea otra matriz a partir del ejercicio anterior con los siguientes valores:
{false, false, false, false, true},
{false, false, false, true, true},
{false, false,  true, false, true},
{false, true, false, false, true},
{true, false, false, false, true},
{false, false, false, false, true},
{false, false, false, false, true},
{false, false, false, false, true}

Muestra las dos matrices por pantalla según las reglas anteriores.*/
package ejercicios.Unidad7;

public class U7_3b {
    static boolean[][] matriz1 = {
            { true, true, true, true, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, false, false, false, true },
            { true, true, true, true, true }
    };
    static boolean[][] matriz2 = {
            { false, false, false, false, true },
            { false, false, false, true, true },
            { false, false, true, false, true },
            { false, true, false, false, true },
            { true, false, false, false, true },
            { false, false, false, false, true },
            { false, false, false, false, true },
            { false, false, false, false, true }
    };

    static void mostrarArray(boolean[][] matriz) {
        for (boolean[] fila : matriz) {
            System.out.println();
            for (boolean celda : fila) {
                System.out.print(celda ? 0 : " ");
            }
        }
        ;
    };

    public static void main(String[] args) {
        mostrarArray(matriz1);
        mostrarArray(matriz2);
    };
}