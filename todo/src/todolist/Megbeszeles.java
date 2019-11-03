package todolist;

public class Megbeszeles extends Teendo {
    private String withWho;
    private String where;

    public Megbeszeles(String time, String withWho, String where) {
        super("Megbeszeles", time, 1);
        this.withWho = withWho;
        this.where = where;
    }

    public String getWithWho() {
        return this.withWho;
    }

    public void setWithWho() {
        this.withWho = withWho;
    }

    public String getWhere() {
        return this.where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String toString() {
        return super.toString() + ", kivel: " + this.withWho + ", hol: " + this.where;
    }
}
