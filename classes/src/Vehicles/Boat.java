package Vehicles;

public class Boat extends Vehicle {
    private boolean isOnSea;

    public Boat(String type, int year, boolean isOnSea) {
        super(type, year);
        this.isOnSea = isOnSea;
    }

    public void sound() {
        System.out.println("tuuuuut");
    }

    public String toString() {
        return super.toString() + ", is on sea: " + isOnSea;
    }

    public boolean isOnSea() {
        return isOnSea;
    }

    public void setIsOnSea(boolean isOnSea) {
        this.isOnSea = isOnSea;
    }
}
