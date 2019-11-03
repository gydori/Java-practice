package todolist;

public class Bevasarlas extends Teendo {
    private String what;
    private int amount;

    public Bevasarlas(String time, String what, int amount) {
        super("Bevasarlas", time, 3);
        this.what = what;
        this.amount = amount;
    }

    public String getWhat() {
        return this.what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return super.toString() + ", mit: " + this.what + ", mennyiért: " + this.amount;
    }
}
