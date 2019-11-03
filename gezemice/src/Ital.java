public abstract class Ital {
    public Ital() {
    }

    public abstract String mibolKeszult();

    public abstract String milyenIzu();

    public String toString() {
        return mibolKeszult() + " " + milyenIzu();
    }
}
