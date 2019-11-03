import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stringLL = new LinkedList<>();
        stringLL.add("proba1");
        stringLL.add("proba2");
        stringLL.add("proba3");
        //System.out.println(stringLL);
        stringLL.remove(1);
        //System.out.println(stringLL);
        stringLL.set(1, "proba2");
        //System.out.println(stringLL);
        Iterator<String> it = stringLL.iterator();
        /*while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        //----------------------------------------------------------
        ArrayList<String> arrayL = new ArrayList<>();
        arrayL.add("proba1");
        arrayL.add("proba2");
        arrayL.add("proba3");
        //System.out.println(arrayL);
        arrayL.remove(1);
        //System.out.println(arrayL);
        arrayL.set(1, "proba2");
        //System.out.println(arrayL);
        Iterator<String> it2 = arrayL.iterator();
        /*while (it2.hasNext()) {
            System.out.println(it2.next());
        }*/

        //------------------------------------------------------------
        HashSet<String> hs = new HashSet<>();
        hs.add("proba1");
        hs.add("proba2");
        hs.add("proba3");
        //System.out.println(hs);
        Iterator<String> it3 = hs.iterator();
/*        while (it3.hasNext()) {
            System.out.println(it3.next());
        }*/

        //------------------------------------------------------------
        TreeSet<String> ts = new TreeSet<>();
        hs.add("proba1");
        hs.add("proba2");
        hs.add("proba3");
        //System.out.println(hs);
        Iterator<String> it4 = hs.iterator();
    /*    while (it4.hasNext()) {
            System.out.println(it4.next());
        }*/
        //---------------------------------------------------------------
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "proba1");
        hm.put(2, "proba2");
        hm.put(3, "proba3");
        //System.out.println(hm);
/*        for (int key : hm.keySet()) {
            System.out.println(hm.get(key));
        }*/

        //----------------------------------------------------------------
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "proba1");
        tm.put(2, "proba2");
        tm.put(3, "proba3");
        //System.out.println(tm);
/*        for (int key : tm.keySet()) {
            System.out.println(tm.get(key));
        }*/

    }
}
