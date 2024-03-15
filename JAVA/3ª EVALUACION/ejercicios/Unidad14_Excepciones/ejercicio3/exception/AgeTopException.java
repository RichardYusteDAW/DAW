package exception;

public class AgeTopException extends Exception {

    public AgeTopException() {
        super("Tienes que tener menos de 65 años para pasar");
    }

}