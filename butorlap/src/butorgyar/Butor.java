package butorgyar;

public class Butor {
    private int lapSzam;
    private Butorlap[] butorlapok;

    public Butor() {
        lapSzam = 0;
        butorlapok = new Butorlap[100];
    }

    public void lapHozzaad(Butorlap butorlap) {
        butorlapok[lapSzam] = butorlap;
        lapSzam++;
    }

    /*public void lapHozzaad(Butorlap butorlap) {
        butorlapok[lapSzam++] = butorlap;
    }
     */

    public double arSzamol() {
        double ar = 0;
        for (int i = 0; i < lapSzam; i++) {
            ar = ar + butorlapok[i].arSzamol();
        }
        return ar;
    }

    public String toString() {
        return "Butor - lapok: " + lapSzam + ", ar: " + arSzamol() + " Ft";
    }
}
