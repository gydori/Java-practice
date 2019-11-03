package cars;

public interface CarFactory {
    Car createCar(String model, int ccm, int hp, Color color, boolean isElectric);
}
