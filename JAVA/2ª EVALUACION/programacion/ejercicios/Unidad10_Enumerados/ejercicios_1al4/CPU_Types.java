package ejercicios.Unidad10_Enumerados.ejercicios_1al4;

public enum CPU_Types {
    PENTIUM_GOLD_G7400("3.7 GHz", "2/4"),
    CORE_I5_12400F("2.1 GHz", "2/8"),
    RYZEN_7_5800X("3.8 GHz", "6/12"),
    CORE_I7_12700KF("3.8 GHz", "8/16"),
    RYZEN_3_4100("3.8 GHz", "12/20");

    private String speed;
    private String threads;

    CPU_Types(String speed, String threads) {
        this.speed = speed;
        this.threads = threads;
    }

    public String getSpeed() {
        return speed;
    }

    public String getThreads() {
        return threads;
    }
}
