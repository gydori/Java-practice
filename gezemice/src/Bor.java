public class Bor extends Ital implements Alkoholos, Kozos {
    private String szoloFajta;
    private String iz;
    private double alkoholTartalom;

    public Bor(String szoloFajta, String iz, double alkoholTartalom) {
        this.szoloFajta = szoloFajta;
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }


    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String mibolKeszult() {
        return this.szoloFajta;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "bor: " + super.toString() + " " + mennyiAlkoholtTartalmaz();
    }
}
