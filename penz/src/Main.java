import penz.Penz;
import penz.Penztarca;

public class Main {
    public static void main(String[] args) {
        Penztarca penztarca = new Penztarca();
        Penz penz1 = new Penz(true, 10);
        Penz penz2 = new Penz(false, 100);
        Penz penz3 = new Penz(true, 10);
        penztarca.PenzBetesz(penz1);
        penztarca.PenzBetesz(penz2);
        penztarca.PenzBetesz(penz3);
        System.out.println(penz1.toString());
        System.out.println(penztarca.penzSzamol(10));
        System.out.println(penztarca.penzSzamol(true));
        System.out.println("a".repeat(6));
    }
}
