public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("a1");
        Auto a2 = new Auto("a2");
        Motor m1 = new Motor("m1");
        Motor m2 = new Motor("m2");
        Motor m3 = new Motor("m3");
        Garage gar = new Garage(8);

        gar.addGarage(a1);
        gar.addGarage(a2);
        gar.addGarage(m1);
        gar.addGarage(m2);
        gar.addGarage(m3);
        gar.remove(3);
        System.out.println(gar.getVehicles());
        System.out.println(gar.getAutos());
        System.out.println(gar.getMotors());
        System.out.println(gar);
    }
}
