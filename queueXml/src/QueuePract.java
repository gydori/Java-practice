import java.util.LinkedList;
import java.util.Queue;

public class QueuePract {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("proba1");
        q.add("proba2");
        q.add("proba3");
        System.out.println(q);
        System.out.println(q.element());
        q.offer("probaOffer");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);

        for (String item : q) {
            System.out.println(item);
        }
    }


}
