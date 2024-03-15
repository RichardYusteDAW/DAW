package runtimeexception;

public class AgeLowerException extends RuntimeException {

    public AgeLowerException() {
        super("Tienes que ser mayor de edad para pasar");
    }

}