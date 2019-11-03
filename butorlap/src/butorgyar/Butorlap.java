package butorgyar;

public class Butorlap {
    private final int arTarto = 5000;
    private final int arHat = 500;
    private double hossz;
    private double szelesseg;
    private boolean tipus; // true-tartólap, false-hátlap

    public Butorlap(boolean tipus, int hossz, int szelesseg) {
        this.hossz = hossz / (double) 100;
        this.szelesseg = szelesseg / (double) 100;
        this.tipus = tipus;
    }


    public double arSzamol() {
        double ar;
        if (tipus == true) {
            ar = hossz * szelesseg * arTarto;
        } else {
            ar = hossz * szelesseg * arHat;
        }
        return ar;
    }

    /*public double arSzamol(){
        return(szelesseg * hossz) *(tipus ? arTarto : arHat);
    }
     */
}
