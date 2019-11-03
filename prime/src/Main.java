import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Prime p = new Prime(2542313003l);
        /*PrimeTester p1 = new PrimeTester(p, 2, (p.getNum() / 4));
        PrimeTester p2 = new PrimeTester(p, p.getNum() / 4, p.getNum() / 2);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();*/

        runThread(2, p);

        System.out.println(p.isPrime());
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println(time);

        /*    startTime = System.nanoTime();
            PrimeTester p3 = new PrimeTester(p, 2, p.getNum() / 2);
            Thread t3 = new Thread(p3);
            t3.start();
            t3.join();
            System.out.println(p.isPrime());
            endTime = System.nanoTime();
            time = endTime - startTime;
            System.out.println(time);
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }

    public static void runThread(int n, Prime p) {
        long min = 2;
        long max = (long) Math.ceil(Math.ceil((double) p.getNum() / 2) / n);
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            PrimeTester pt = new PrimeTester(p, min, max);
            System.out.println(min + " " + max);
            min = max;
            max = max + p.getNum() / 2 / n;
            Thread t = new Thread(pt);
            ts.add(t);
            t.start();
        }
        System.out.println(ts.size());
        try {
            for (int i = 0; i < n; i++) {
                ts.get(i).join();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
