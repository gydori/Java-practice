public class TeslaFactory implements CarFactory {

    @Override
    public Car createCar(String model, int ccm, int hp, Color color) {
        return new Tesla(model, ccm, hp, color);
    }
}
