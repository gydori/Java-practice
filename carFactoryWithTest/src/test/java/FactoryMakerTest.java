import org.junit.jupiter.api.Test;

import java.util.Random;

public class FactoryMakerTest {
    @Test
    public void testMakeFactory() {
        CarFactory carFactory = FactoryMaker.makeFactory(FactoryType.values()[new Random().nextInt(FactoryType.values.length())]);
        Car car = carFactory
    }
}
