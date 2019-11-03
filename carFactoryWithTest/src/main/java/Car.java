public class Car {
    private String model;
    private int ccm;
    private int hp;
    private Color color;
    private boolean isElectric;

    public Car(String model, int ccm, int hp, Color color, boolean isElectric) {
        this.model = model;
        this.ccm = ccm;
        this.hp = hp;
        this.color = color;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
