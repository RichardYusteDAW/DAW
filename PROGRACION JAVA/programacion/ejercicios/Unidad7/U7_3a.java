/*Crea una matriz de 5×8 de booleans con los siguientes valores:
{true, true, true, true, true},
{true, false, false, false, true},
{true, false, false, false, true},
{true, false, false, false, true},
{true, false, false, false, true},
{true, false, false, false, true},
{true, false, false, false, true},
{true, true, true, true, true}

Haz que se muestre por pantalla la matriz según la siguiente regla:
Si el valor es true, se mostrará un 0 (cero)
Si el valor es false se mostrará un espacio en blanco.
*/
package ejercicios.Unidad7;

public class U7_3a {
    public static void main(String[] args) {
        boolean[][] matriz = {
                { true, true, true, true, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, false, false, false, true },
                { true, true, true, true, true }
        };

        for (boolean[] fila : matriz) {
            System.out.println();
            for (boolean celda : fila) {
                System.out.print(celda ? 0 : " ");
            }
        }
        ;
    }
}