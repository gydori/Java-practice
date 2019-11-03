package penz;

public class Penztarca {
    public int penzDb;
    Penz[] penzek;

    public Penztarca() {
        penzDb = 0;
        penzek = new Penz[100];
    }

    public void PenzBetesz(Penz penz) {
        if (penzDb < 100) {
            penzek[penzDb++] = penz;
        } else {
            System.out.println("Nem fér bele több");
        }
    }

    public int penzSzamol(int nevertek) {
        int sum = 0;
        for (int i = 0; i < penzDb; i++) {
            if (penzek[i].nevertek == nevertek) {
                sum += penzek[i].nevertek;
            }
        }
        return sum;
    }

    public int penzSzamol(boolean isPaper) {
        int count = 0;
        for (int i = 0; i < penzDb; i++) {
            if (penzek[i].ispaper == isPaper) {
                count++;
            }
        }
        return count;
    }
}
