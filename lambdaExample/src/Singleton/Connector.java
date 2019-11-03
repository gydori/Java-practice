package Singleton;

public class Connector {
    private static Connector single_instance = null;

    private Connector() {       //new-val nem tudjuk példányosítani, csak a getInstance-el, mert private a konstruktor
    }

    public static Connector getInstance() {     //csak egy példány lehet belőle
        if (single_instance == null) {
            single_instance = new Connector();
        }
        return single_instance;
    }

    @Override
    public String toString() {
        return "Connector{}";
    }
}
