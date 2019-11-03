public class FalraHanytBorso implements Alkoholos, Kozos {
    private double alkoholTartalom;
    private String iz;

    public FalraHanytBorso(double alkoholTartalom, String iz) {
        this.alkoholTartalom = alkoholTartalom;
        this.iz = iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "Borsó: " + mennyiAlkoholtTartalmaz() + " " + milyenIzu();
    }
}
