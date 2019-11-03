package Main;

import Vehicles.Boat;
import Vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car kocsi = new Car("renault", 2008, 4);
        Boat hajo = new Boat("vitorlás", 2000, false);

        kocsi.sound();
        System.out.println(kocsi.toString());

        hajo.sound();
        System.out.println(hajo.toString());
    }
}
