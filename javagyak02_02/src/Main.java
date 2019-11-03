public class Main {
    public static void main(String[] args) {
        //readIn(args);
        //avgSum(args);
        //series(args);
        //seriesMashogy(args);
        for (int i = 0; i < 8; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void readIn(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void avgSum(String[] a) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + Integer.parseInt(a[i]);
        }
        avg = (double) sum / a.length;
        System.out.println("Az összeg: " + sum);
        System.out.println("Az átlag: " + avg);
    }

    public static void series(String[] a) {
        int cSzamt = 0;
        int cMert = 0;
        int cFibo = 0;
        for (int i = 2; i < a.length; i++) {
            if (Integer.parseInt(a[i]) - Integer.parseInt(a[i - 1]) == Integer.parseInt(a[i - 1]) - Integer.parseInt(a[i - 2])) {
                cSzamt++;
            }
            if (Integer.parseInt(a[i - 1]) != 0 && Integer.parseInt(a[i - 2]) != 0 && Integer.parseInt(a[i]) / Integer.parseInt(a[i - 1]) == Integer.parseInt(a[i - 1]) / Integer.parseInt(a[i - 2])) {
                cMert++;
            }
            if (Integer.parseInt(a[i]) == Integer.parseInt(a[i - 1]) + Integer.parseInt(a[i - 2])) {
                cFibo++;
            }
        }
        if (cSzamt == a.length - 2) {
            System.out.println("Ez egy számtani sorozat.");
        }
        if (cMert == a.length - 2) {
            System.out.println("Ez egy mértani sorozat.");
        }
        if (cFibo == a.length - 2) {
            System.out.println("Ez egy fibonacci sorozat.");
        }
        if (cSzamt != a.length - 2 && cMert != a.length - 2 && cFibo != a.length - 2) {
            System.out.println("Ez semmilyen sorozat.");
        }
    }

    public static void seriesMashogy(String... args) {
        for (int i = 2; i < args.length; i++) {
            int a = Integer.parseInt(args[i - 2]);
            int b = Integer.parseInt(args[i - 1]);
            int c = Integer.parseInt(args[i]);
            if (b - a != c - b) {
                break;
            }
            if (i == args.length - 1) {
                System.out.println("Számtani sorozat");
            }
        }
        // stb...
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
