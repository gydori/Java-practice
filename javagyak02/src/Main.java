public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double res = a / b;  // Ha két egész számot osztunk, az eredmény is egész, megoldás: valamelyik vagy mindkettő legyen double
        //System.out.println(res);
        //System.out.println(divide(a, b));
        //System.out.println(strToInt("12"));
        //System.out.println(strToInt("kiscica"));        //Exception -> futás idejű hiba (nem szintaktika)
/*        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/
        int[] arr = new int[10];        //Üres tömb, mely 10 elemet fog tárolni
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/
        //printArray(args);
        printThreeDotArray("a", "b", "c", "d");
    }

    public static double divide(int a, int b) {
        double res = (double) a / b;      // Explicit megadjuk, hogy double-ként kezelje az int-et
        return res;
    }

    public static int strToInt(String s) {
        int res = Integer.parseInt(s);      //Szövegből egész szám "12"-> 12, "kiscica"-> Exception
        double d = Double.parseDouble(s);
        short sh = Short.parseShort(s);
        return res;
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {            //Tömb elemein iterál
            System.out.println(element);
        }
    }

    public static void printThreeDotArray(String... arr) {
        for (String element : arr) {
            System.out.print(element + " ");        //Egymás mellé írunk
        }
    }
}
