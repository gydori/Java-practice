package harcosokklubja;

public class Nagydarab extends Harcos {
    private int endurance;

    public Nagydarab(int power, int health, int endurance) {
        super(power, health);
        this.endurance = endurance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getHealth() {
        return super.getHealth() + this.endurance;
    }

    @Override
    public String toString() {
        return super.toString() + ", nagydarab vagyok, állóképességem: " + this.endurance;
    }
}
