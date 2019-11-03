package Vehicles;

public class Car extends Vehicle {
    private int tires;

    public Car(String type, int year, int tires) {
        super(type, year);
        this.tires = tires;
    }

    public void sound() {
        System.out.println("brrr");
    }

    public String toString() {
        return super.toString() + ", number of tires: " + tires;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }
}
