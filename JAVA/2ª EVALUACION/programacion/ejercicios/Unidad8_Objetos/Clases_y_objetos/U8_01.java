/*
Crea un nuevo proyecto Java. 
Además de la clase principal (puedes llamarla Main o App), 
crea una nueva clase llamada Coche con los atributos marca, modelo, color, numeroBastidor y velocidad. 
Los 3 primeros serán String y los dos últimos de tipo int. La velocidad inicial será de 0.

En la clase principal, crea un nuevo coche, asígnale valores a sus atributos y muestra por pantalla la frase:
“Mi coche es un {marca} {modelo} de color {color} con número de bastidor {numeroBastidor}”, 
sustituyendo las variables encerradas entre llaves por los valores que le hayas dado a las propiedades al crear el coche. 
 */
package ejercicios.Unidad8_Objetos.Clases_y_objetos;

public class U8_01 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        System.out.printf("Mi coche es un %s %s de color %s con número de bastidor %d", car.brand, car.model,
                car.color, car.chassisNumber);

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;
}