package runtimeexception;

public class AgeTopException extends RuntimeException {

    public AgeTopException() {
        super("Tienes que tener menos de 65 años para pasar");
    }

}