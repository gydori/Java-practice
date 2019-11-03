package main;

public class Cat extends Animal {        // leszármazik az Animal osztályból. Mindig legfeljebb egy ős lehet.

    private int numberOfLifes;

    public Cat(String name, int age, int numberOfLifes) {
        // A supernek kell lennie az elsőnek a konstruktorban
        // super olyan mint a this, csak az ősosztályra vonatkozik
        super(name, age, true);     // Meg kell hívni az ősosztály konstruktorát, kivéve, ha annak van default konstruktora
        this.numberOfLifes = numberOfLifes;
    }

    public String sayHello() {     //függvény override, azaz az ősosztály függvényét felüldefiniáljuk
        return super.sayHello() + " és életeim száma: " + numberOfLifes;
    }

    public void sound() {            //Megvalósítjuk az absztrakt függvényt
        System.out.println("Meow");
    }

}
