public class Garage<T> {
    private T[] garageList;
    private int pointer;

    public Garage(int length) {
        this.garageList = (T[]) new Object[length];
        this.pointer = 0;
    }

    public void addGarage(T value) throws OverflowException {
        if (this.pointer > garageList.length - 1) {
            throw new OverflowException("Nincs több hely");
        } else {
            garageList[this.pointer] = value;
            this.pointer++;
        }
    }

    public int getVehicles() {
        int count = 0;
        for (int i = 0; i < garageList.length; i++) {
            if (garageList[i] instanceof Vehicle) {
                count++;
            }
        }
        return count;
    }

    public int getAutos() {
        int count = 0;
        for (int i = 0; i < garageList.length; i++) {
            if (garageList[i] instanceof Auto) {
                count++;
            }
        }
        return count;
    }

    public int getMotors() {
        int count = 0;
        for (int i = 0; i < garageList.length; i++) {
            if (garageList[i] instanceof Motor) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < garageList.length; i++) {
            sb.append(garageList[i] + " ");
        }
        return sb.toString();
    }

    public void remove(int i) throws UnderflowException {
        if (garageList[i] == null) {
            throw new UnderflowException("Ezen a helyen nem áll jármű");
        } else {
            System.out.println(garageList[i] + " elment");
            garageList[i] = null;
        }
    }
}
