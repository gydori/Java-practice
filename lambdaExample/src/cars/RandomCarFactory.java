package cars;

public class RandomCarFactory implements CarFactory {

    Car opel = new Car("astra", 1000, 100, Color.RED, false);
    Car renault = new Car("clio", 2000, 90, Color.BLACK, false);
    Car citroen = new Car("c3", 2500, 80, Color.RED, false);
    Car[] cars = {opel, renault, citroen};

    @Override

    public Car createCar(String model, int ccm, int hp, Color color, boolean isElectric) {
        int rand = (int) Math.floor(Math.random() * 3);
        return cars[rand];
    }
}
