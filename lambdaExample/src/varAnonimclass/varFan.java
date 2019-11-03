package varAnonimclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class varFan {
    public static void main(String[] args) {
        //java 5
        List<Integer> ints5 = new ArrayList<Integer>();
        //java 7
        List<Integer> ints7 = new ArrayList<>();
        //java 11
        var ints11 = new ArrayList<Integer>();

        var string = "asd";

        var f = new Feri() {        //Anonim osztály
            @Override
            //A var képes olyan osztályt is létrehozni, ami amúgy nem létezne.
            public void drinkBeer() {                           //ha Feri f = new Feri() lenne, akkor a drinkWater-t nem tudnánk meghívni, mert az interface-nek nincs olyan függvénye
                System.out.println("I love beer");
            }

            public void drinkWater() {
                throw new RuntimeException();
            }
        };
        f.drinkBeer();
        f.drinkWater();

        var feri = Optional.of(new Feri() {
            @Override
            //A var képes olyan osztályt is létrehozni, ami amúgy nem létezne.
            public void drinkBeer() {                  //ha Feri f = new Feri() lenne, akkor a drinkWater-t nem tudnánk meghívni, mert az interface-nek nincs olyan függvénye
                System.out.println("I love beer");
            }

            public String drinkWater() {
                return "i hate water";
            }
        }).map(f1 -> f1.drinkWater()).orElse(null);
    }

    interface Feri {
        void drinkBeer();       //interface-t is lehet példányosítani
    }
}
