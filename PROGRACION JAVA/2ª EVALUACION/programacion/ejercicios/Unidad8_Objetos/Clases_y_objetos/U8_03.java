/*
Crea dos métodos en la clase Coche que permitan aumentar o reducir la velocidad del coche en 5. 
Utiliza ambos métodos por pantalla y muestra la velocidad para comprobar que funcionan correctamente. 
*/
package ejercicios.Unidad8_Objetos.Clases_y_objetos;

public class U8_03 {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ford";
        car.model = "Smax";
        car.color = "Azul";
        car.chassisNumber = 1234567890;
        car.speed = 50;

        car.increaseSpeed();
        System.out.println("La velocidad del coche es " + car.speed);
        car.reduceSpeed();
        System.out.println("La velocidad del coche es " + car.speed);

    }
}

public class Car {
    public String brand, model, color;
    public int chassisNumber, speed = 0;

    public void increaseSpeed() {
        speed += 5;
    }

    public void reduceSpeed() {
        speed -= 5;
    }
}
