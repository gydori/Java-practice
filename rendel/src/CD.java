public class CD implements Rendelheto {

    private String singer;
    private String title;

    public CD(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public String toString() {
        return "Singer: " + this.singer + ", title: " + this.title;
    }

    public void rendel(int a) {
        System.out.println("Rendelni kell " + a + " CD-t az alábbiból: " + this.toString());
    }
}

