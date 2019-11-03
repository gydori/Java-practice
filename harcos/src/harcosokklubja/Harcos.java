package harcosokklubja;

public class Harcos {
    private int power;
    private int health;

    public Harcos(int power, int health) {
        this.power = power;
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Harcos vagyok, ütőerőm: " + this.power + ", egészségem: " + this.getHealth();
    }

    public void megut(Harcos harcos) {
        if ((harcos instanceof Nagydarab && ((Nagydarab) harcos).getEndurance() > this.power)) {
            System.out.println("Megütött egy másik harcos, jelenlegi állapotod: " + harcos);
        } else {
            harcos.setHealth(harcos.getHealth() - this.power);
            System.out.println("Megütött egy másik harcos, jelenlegi állapotod: " + harcos);
        }
    }


}
