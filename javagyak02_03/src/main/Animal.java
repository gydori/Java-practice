package main;

import java.util.Objects;

public abstract class Animal {       //Osztály  //Absztrakt osztáyt nem lehet példányosítani

    private String name;         //Adattagok - ezek legyenek private-ok --> "egységbe zárás"
    private int age;
    private boolean isMammal;

    // private - legszigorúbb - csak az adott osztályon belül látható
    // protected - csomagon belüli láthatóság (adott osztály, csomagban, leszármazottban is)
    // ha nem adunk meg semmit - adott osztályban, adott csomagban látszik, de sem kívül, sem a leszármazottban nem
    // public - osztályon belül, kívül, leszármazottban, és más csomagban is látszik

    /*   public Animal() {        // Default konstruktor
           this.name = "";
           this.age = 0;
           this.isMammal = false;
       }
   */
    public Animal(String name, int age, boolean isMammal) {        // Konstruktor: Ő hozza létre az objektumot (mindig public, nincs visszatérési értéke, ugyanaz a neve, mint az osztálynak)
        this.name = name;           //This kulcsszó az adott objektumra mutat. Itt pl az objektumok adattagjára
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(String name) {     //Konstruktor overloading - ugyanaz a függvény fejléce, de ELTÉRŐ PARAMÉTERLISTÁVAL
        this.name = name;
        this.age = 0;
        this.isMammal = true;
    }

    /*public Animal(String sth){        // nem lehet ugyanolyan paraméterlista, még típusban sem
        this.sth;
      }
     */

    public abstract void sound();          // absztrakt függvény: nem implementáljuk itt, hanem a leszármazottban

    public String sayHello() {
        return ("Szia " + name + " vagyok, " + age + " éves, " + (isMammal ? "emlős" : "nem emlős")); //ternális operátor
    }

    public String toString() {      //felülírja az alap toString-et, ha csak simán kiprinteljük az objectet, akkor ezt fogja kiírni
        return "Szia " + name + " vagyok, " + age + " éves, " + (isMammal ? "emlős" : "nem emlős");
    }

    public String getName() {        //Getter függvény: visszaadja az adattag értékét
        return name;
    }

    public void setName(String name) {       //Setter függvény: beállítja az adattag értékét
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age && age < 30) {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    @Override   //annotáció
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                isMammal() == animal.isMammal() &&
                getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isMammal());
    }
}
