public class Main {


    public static void main(String[] args) {
        //age();
        //list();
        //degree();
        //maxRand();
        //divRand();
        //evenRand();
        //descRand();
        //minRand();
        //two();
        //numbers();
        //evenNumbers();
        //oddNumbers();
        //threeMult();
        //descNumbers();
        //fiveMult();
        //between();
        //betweenIn();
        //randomRand();
        movie();
    }

    public static void age() {
        int a = 18;
        int b = a + 2;
        int c = a - 5;
        System.out.println("Alíz " + a + " éves, Boborján " + b + " éves, Csilla " + c + " éves.");
        System.out.println("Együtt " + (a + b + c) + " évesek.");
    }

    public static void list() {
        int a = 30;
        int b = a * 2;
        int c = a * 3;
        System.out.println("Almából " + a + " dkg, banánból " + b + " dkg, citromból " + c + " dkg kell.");
        double sumFruit = (a + b + c) / 100.0;
        System.out.println("Összesen " + sumFruit + " kg gyümölcs kell");
    }

    public static void degree() {
        int c = 5;
        int k = c + 273;
        int f = c * 18 / 10 + 32;
        System.out.println(c + " Celsius fok, " + k + " Kelvin fok, " + f + " Fahrenheit fok van.");
    }

    public static void maxRand() {
        int x = (int) Math.floor(Math.random() * 10 + 1);
        int y = (int) Math.floor(Math.random() * 10 + 1);
        if (x > y) {
            System.out.println("A számok: " + x + " és " + y + ". A nagyobbik: " + x);
        } else if (y > x) {
            System.out.println("A számok: " + x + " és " + y + ". A nagyobbik: " + y);
        } else {
            System.out.println("A számok: " + x + " és " + y + ". A számok egyenlőek.");
        }
    }

    public static void divRand() {
        int x = (int) Math.floor(Math.random() * 100 + 1);
        int y = (int) Math.floor(Math.random() * 100 + 1);
        if (y == 0) {
            System.out.println("A számok: " + x + " és " + y + ". 0-val nem osztunk.");
        } else if (x % y == 0) {
            System.out.println("A számok: " + x + " és " + y + ". x osztható y-nal, a hányados: " + (x / y));
        } else {
            System.out.println("A számok: " + x + " és " + y + ". x nem osztható y-nal");
        }
    }

    public static void evenRand() {
        int x = (int) Math.floor(Math.random() * 201 - 100);
        if (x % 2 == 0) {
            System.out.println("A szám: " + x + " , x páros.");
        } else {
            System.out.println("A szám: " + x + " , x páratlan.");
        }
    }

    public static void descRand() {
        int x = (int) Math.floor(Math.random() * 101 - 50);
        int y = (int) Math.floor(Math.random() * 101 - 50);
        int z = (int) Math.floor(Math.random() * 101 - 50);
        System.out.println("A számok: " + x + " " + y + " " + z);
        if (x > y && x > z) {
            System.out.print(x + " ");
            if (y > z) {
                System.out.print(y + " ");
                System.out.print(z);
            } else {
                System.out.print(z + " ");
                System.out.print(y);
            }
        } else if (y > x && y > z) {
            System.out.print(y + " ");
            if (x > z) {
                System.out.print(x + " ");
                System.out.print(z);
            } else {
                System.out.print(z + " ");
                System.out.print(x);
            }
        } else {
            System.out.print(z + " ");
            if (x > y) {
                System.out.print(x + " ");
                System.out.print(y);
            } else {
                System.out.print(y + " ");
                System.out.print(x);
            }
        }

    }

    public static void minRand() {
        int a = (int) Math.floor(Math.random() * 431 - 110);
        int b = (int) Math.floor(Math.random() * 431 - 110);
        int c = (int) Math.floor(Math.random() * 431 - 110);
        int d = (int) Math.floor(Math.random() * 431 - 110);
        int e = (int) Math.floor(Math.random() * 431 - 110);
        int[] tomb = {a, b, c, d, e};
        int min = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        System.out.println("A számok: " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("A legkisebb: " + min);
    }

    public static void two() {
        double a = Math.floor(Math.random() * 201);
        System.out.println("A szám: " + a);
        if (Math.floor(Math.log10(a)) + 1 == 2) {
            double aFirst = Math.floor(a / 10);
            double aSecond = a - aFirst * 10;
            System.out.println("A számjegyek összege: " + (aFirst + aSecond));
            if (aFirst % 2 == 0 && aSecond % 2 == 0) {
                System.out.println("Kettő páros számjegye van.");
            } else if ((aFirst % 2 == 0 && aSecond % 2 != 0) || (aFirst % 2 != 0 && aSecond % 2 == 0)) {
                System.out.println("Egy páros számjegye van.");
            } else {
                System.out.println("Nincs páros számjegye.");
            }
        } else {
            System.out.println("A szám nem kétjegyű.");
        }
    }

    public static void numbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void threeMult() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void descNumbers() {
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void fiveMult() {
        int x = (int) Math.floor(Math.random() * 10 + 1);
        System.out.println("A sor legyen " + x + " elemű.");
        for (int i = 1; i <= x * 5; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void between() {
        int x = (int) Math.floor(Math.random()*4 + 1);
        int y = (int) Math.floor(Math.random()*6 + 5);
        System.out.println("A két szám: " + x + " " + y);
        int min;
        int max;
        if(x<y){
            min = x;
            max = y;
        }else{
            min = y;
            max = x;
        }
        for(int i = min; i<=max; i++){
            System.out.print(i + " ");
        }
    }

    public static void betweenIn() {
        int x = (int) Math.floor(Math.random()*3 + 1);
        int y = (int) Math.floor(Math.random()*6 + 5);
        System.out.println("A két szám: " + x + " " + y);
        int min;
        int max;
        if(x<y){
            min = x;
            max = y;
        }else{
            min = y;
            max = x;
        }
        for(int i = min+1; i<max; i++){
            System.out.print(i + " ");
        }
    }

    public static void randomRand(){
        int x = (int)Math.floor(Math.random()*6 + 5);
        int y = (int)Math.floor(Math.random()*4 + 1);
        int z = (int)Math.floor(Math.random()*4 + 10);
        int min;
        int max;
        if(y>z){
            min = z;
            max = y;
        }else{
            min = y;
            max = z;
        }
        System.out.println(x + " db szám " + min + " és " + max + " között.");
        for(int i = 0; i<x; i++){
            int a = (int)Math.floor(Math.random()*(max-min+1) + min);
            System.out.print(a + " ");
        }
    }

    public static void movie(){
        int price = (int)Math.floor(Math.random()*11 + 10)*100;
        System.out.println("Az alap ár: " + price);
        int audience = (int)Math.floor(Math.random()*20 + 1);
        int[]age = new int[audience];
        for(int i = 0; i<audience; i++){
            age[i] = (int)Math.floor(Math.random()*99 + 1);
        }
        for(int i = 0; i<age.length; i++){
            if(age[i]<5){
                System.out.println("Életkor: " + age[i] + ", ár: " + 0);
            }else if(age[i]>65){
                System.out.println("Életkor: " + age[i] + ", ár: " + (price/2));
            }else{
                System.out.println("Életkor: " + age[i] + ", ár: " + price);
            }
        }
    }
}
