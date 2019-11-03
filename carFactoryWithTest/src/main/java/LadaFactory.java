public class LadaFactory implements CarFactory {

    @Override
    public Car createCar(String model, int ccm, int hp, Color color) {
        return new Lada(model, ccm, hp, color);
    }
}
