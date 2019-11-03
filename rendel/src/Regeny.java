public class Regeny extends Konyv implements Rendelheto {
    private String content;

    public Regeny(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public boolean dedikalASzerzo() {
        return true;
    }

    public String toString() {
        return "Author: " + this.author + ", title: " + this.title + ", content: " + this.content;
    }

    public void rendel(int a) {
        System.out.println("Rendelni kell " + a + " regényt az alábbiból: " + this.title);
    }
}
