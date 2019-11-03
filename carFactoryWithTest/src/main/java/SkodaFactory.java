public class SkodaFactory implements CarFactory {

    @Override
    public Car createCar(String model, int ccm, int hp, Color color) {
        return new Skoda(model, ccm, hp, color);
    }
}
