public class Main {
    public static void main(String[] args) {
        //replace("áppppéíóöőúüű");
        //scale("2AB34");
        //appendTest();
        test("He is a very very good boy, isn't he?");
    }

    public static void replace(String str) {
        StringBuilder strSB = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (strSB.charAt(i) == 'á') strSB.setCharAt(i, 'a');
            if (strSB.charAt(i) == 'é') strSB.setCharAt(i, 'e');
            if (strSB.charAt(i) == 'í') strSB.setCharAt(i, 'i');
            if (strSB.charAt(i) == 'ó') strSB.setCharAt(i, 'o');
            if (strSB.charAt(i) == 'ö') strSB.setCharAt(i, 'o');
            if (strSB.charAt(i) == 'ő') strSB.setCharAt(i, 'o');
            if (strSB.charAt(i) == 'ú') strSB.setCharAt(i, 'u');
            if (strSB.charAt(i) == 'ű') strSB.setCharAt(i, 'u');
            if (strSB.charAt(i) == 'ü') strSB.setCharAt(i, 'u');
        }
        System.out.println(strSB);
    }

    public static void scale(String str) {
        try {
            int max = Integer.parseInt(String.valueOf(str.charAt(0)));
            int num = Integer.parseInt(String.valueOf(str.charAt(0)));

            for (int i = 0; i < str.length(); i++) {
                num = Integer.parseInt(String.valueOf(str.charAt(i)));
                if (num > max) {
                    max = num;
                }
            }
            if (num < 2) {
                System.out.println("2-es, 8-as, 10-es, 16-os számrendszer");
            } else if (num < 8 && num >= 2) {
                System.out.println("8-as, 10-es, 16-os számrendszer");
            } else if (num < 10 && num >= 8) {
                System.out.println("10-es, 16-os számrendszer");
            } else {
                System.out.println("Egyik számrendszer sem ezek közül.");
            }


        } catch (NumberFormatException e) {
            char[] tizenhat = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            String tizenhatS = new String(tizenhat);
            int i = 0;
            for (i = 0; i < str.length(); i++) {
                if (!tizenhatS.contains(String.valueOf(str.charAt(i)))) {
                    break;
                }
            }
            System.out.println((i == str.length()) ? "16-os számrendszer" : "Egyik számrendszer sem ezek közül.");
        }

    }

    public static void scale2(String str) {
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (!String.valueOf(str.charAt(i)).matches("([0-9]*[A-F]*)")) {
                break;
            }
        }
        System.out.println((i == str.length()) ? "16-os számrendszer" : "Egyik számrendszer sem ezek közül.");
    }

    public static void appendTest() {
        System.out.println("100 000 iteráció:");
        long before = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += 'a';
        }
        long after = System.currentTimeMillis();
        System.out.println("+=diff: " + (after - before));

        before = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("builder diff: " + (after - before));

        before = System.currentTimeMillis();
        StringBuffer sbu = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbu.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("buffer diff: " + (after - before));

        System.out.println("--------------------------------------");
        System.out.println("1 000 000 iteráció");

        before = System.currentTimeMillis();
        s = "";
        for (int i = 0; i < 1000000; i++) {
            s += 'a';
        }
        after = System.currentTimeMillis();
        System.out.println("+=diff: " + (after - before));

        before = System.currentTimeMillis();
        sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("builder diff: " + (after - before));

        before = System.currentTimeMillis();
        sbu = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbu.append('a');
        }
        after = System.currentTimeMillis();
        System.out.println("buffer diff: " + (after - before));
    }

    public static void test(String s) {
        String[] split = s.split("([!, ?, , , ., _, ', @])");
        System.out.println(split[0]);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
