package penz;

import java.util.Arrays;

public class Penz {
    protected boolean ispaper;
    protected int nevertek;

    public Penz(boolean ispaper, int nevertek) {
        if (Arrays.asList(10, 100, 1000).contains(nevertek)) {
            this.nevertek = nevertek;
            this.ispaper = ispaper;
        } else {
            System.out.println("Nem megfelelő névérték");
        }
    }

    public String toString() {
        return nevertek + " Ft - " + (ispaper ? "papírpénz" : "aprópénz");
    }
}
