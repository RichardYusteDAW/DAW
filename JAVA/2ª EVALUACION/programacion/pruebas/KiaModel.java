package pruebas;

public enum KiaModel {
    NIRO("1.6 GDi HEV 103kW"),
    XCEED("1.6 TGDi 112kW"),
    SPORTAGE("1.0 T-GDi 88kW");

    private String engine;

    private KiaModel(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }
}