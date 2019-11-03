package Singleton;

public class Main {
    public static void main(String args[]) {
        Connector c = Connector.getInstance();
        System.out.println(c);
        Connector d = Connector.getInstance();      //ugyanaz az objektum lesz, mint a c, ugyanoda mutat
    }
}
