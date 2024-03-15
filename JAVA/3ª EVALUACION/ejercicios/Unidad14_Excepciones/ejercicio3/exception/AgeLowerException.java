package exception;

public class AgeLowerException extends Exception {

    public AgeLowerException() {
        super("Tienes que ser mayor de edad para pasar");
    }

}