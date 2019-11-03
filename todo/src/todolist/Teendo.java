package todolist;

public class Teendo {
    private String name;
    private String time;
    private int prior;
    private boolean ready;

    public Teendo() {
        this.name = "";
        this.time = "";
        this.prior = 1;
        this.ready = false;
    }

    public Teendo(String name, String time, int prior) {
        this.name = name;
        this.time = time;
        if (prior >= 1 && prior <= 5) {
            this.prior = prior;
        } else {
            this.prior = 5;
            System.out.println("Rossz bemenet!");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        if (prior >= 1 && prior <= 5) {
            this.prior = prior;
        } else {
            System.out.println("Rossz bemenet!");
        }
    }

    public boolean getReady() {
        return this.ready;
    }

    public void atvalt() {
        this.ready = !this.ready;
    }

    public String toString() {
        return "Teendő: " + this.name + ", melynek ideje: " + this.time + ", prioritása: " + this.prior + ", teljesítve: " + (this.ready ? "igen" : "nem");
    }
}
