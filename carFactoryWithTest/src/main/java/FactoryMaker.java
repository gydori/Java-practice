public class FactoryMaker {
    public static CarFactory makeFactory(FactoryType type) {
        return type.makeFactory();
    }


    public enum FactoryType {
        SKODA {
            @Override
            public CarFactory makeFactory() {
                return new SkodaFactory();
            }
        }, TESLA {
            @Override
            public CarFactory makeFactory() {
                return new TeslaFactory();
            }
        }, LADA {
            @Override
            public CarFactory makeFactory() {
                return new LadaFactory();
            }
        };

        public abstract CarFactory makeFactory();
    }
}
