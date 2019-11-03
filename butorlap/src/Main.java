import butorgyar.Butor;
import butorgyar.Butorlap;

public class Main {
    public static void main(String[] args) {
        Butor butor = new Butor();
        Butorlap lap1 = new Butorlap(true, 200, 300);
        Butorlap lap2 = new Butorlap(false, 670, 300);
        Butorlap lap3 = new Butorlap(true, 450, 240);
        Butorlap lap4 = new Butorlap(false, 200, 890);
        butor.lapHozzaad(lap1);
        butor.lapHozzaad(lap2);
        butor.lapHozzaad(lap3);
        butor.lapHozzaad(lap4);
        System.out.println(butor.toString());
    }
}
