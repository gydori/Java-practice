public class Gyumolcsle extends Ital implements Kozos {
    private String gyumolcs;
    private String iz;
    private String marka;

    public Gyumolcsle(String gyumolcs, String iz, String marka) {
        this.gyumolcs = gyumolcs;
        this.iz = iz;
        this.marka = marka;
    }

    @Override
    public String mibolKeszult() {
        return this.gyumolcs;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    public String milyenMarkaju() {
        return this.marka;
    }

    @Override
    public String toString() {
        return "gyümölcslé: " + super.toString() + " " + milyenMarkaju();
    }
}
