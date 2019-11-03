public class Main {
    public static void main(String[] args) {
        //reverse("Indul a gorog aludni");
        //splitString("Indul a gorog aludni");
        //lastWord("Indul a gorog aludni.");
        //replaceAE("Indul a gorog aludni.");
        //replaceO("Indul a gorog aludni.");
        lastWord2("Indul a gorog aludni?");
    }

    public static void reverse(String s) {
        StringBuilder rev = new StringBuilder(s);
        rev = rev.reverse();
        System.out.println(rev.toString());
    }

    public static void splitString(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    public static void lastWord(String s) {
        String[] split = s.split(" ");
        System.out.println(split[split.length - 1].substring(0, split[split.length - 1].length() - 1));
    }

    public static void replaceAE(String s) {
        System.out.println(s.replaceFirst("a", "e"));
    }

    public static void replaceO(String s) {
        System.out.println(s.replaceAll("o", "O"));
    }

    public static void lastWord2(String s) {
        String[] split = s.split(" ");
        String last = split[split.length - 1];
        char[] sign = {'.', '!', '?'};
        String signStr = new String(sign);
        if (signStr.contains(String.valueOf(last.charAt(last.length() - 1)))) {
            System.out.println(last.substring(0, split[split.length - 1].length() - 1));
        } else {
            System.out.println(last);
        }
    }
}
