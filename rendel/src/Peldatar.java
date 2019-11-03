public class Peldatar extends Konyv {
    private int numberOfTasks;

    public Peldatar(String author, String title, int numberOfTasks) {
        this.author = author;
        this.title = title;
        this.numberOfTasks = numberOfTasks;
    }

    public boolean dedikalASzerzo() {
        return false;
    }

    public String toString() {
        return "Author: " + this.author + ", title: " + this.title + ", number of tasks: " + this.numberOfTasks;
    }
}