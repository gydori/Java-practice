import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        //System.out.println(getLongNames(List.of("a", "asdfghjererer", "kjjhgdsaerere")));
        String[] type = {"rozsak_kicsi.jpg", "természetes szám", "valós szám"};
        //createNum(type).stream().forEach(System.out::println);
        //parosNegativ();
        //maxTerm();
        //paros(12).stream().forEach(System.out::println);
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(1, 2, 6, 7, 8);
        //concat(l1, l2).stream().forEach(System.out::println);
        System.out.println(existCheck(type, "/home/dori/"));
    }

    public static List<String> getLongNames(List<String> stringList) {
        return stringList.stream().filter(s -> s.length() > 8).sorted().collect(Collectors.toList());
    }

    public static List<Szam> createNum(String[] type) {
        List<Szam> szamok = new ArrayList<>();
        for (int i = 0; i < type.length; i++) {
            switch (type[i]) {
                case "egész szám":
                    EgeszSzam esz = new EgeszSzam(Integer.toString((int) Math.floor(Math.random() * 100)));
                    szamok.add(esz);
                    break;
                case "természetes szám":
                    TermeszetesSzam tsz = new TermeszetesSzam(Double.toString(Math.floor(Math.random() * 100)));
                    szamok.add(tsz);
                    break;
                case "valós szám":
                    ValosSzam vsz = new ValosSzam(Double.toString(Math.floor(Math.random() * 100)));
                    szamok.add(vsz);
                    break;
            }
        }
        return szamok;
    }

    public static void parosNegativ() {
        List<Szam> negativ = new ArrayList<>();
        List<Szam> paros = new ArrayList<>();
        int n = 20;
        while (n > 0) {
            ValosSzam vsz = new ValosSzam(Double.toString(Math.floor(Math.random() * 100) - 50));
            if (vsz.isNegativ()) {
                negativ.add(vsz);
            }
            if (vsz.isParos()) {
                paros.add(vsz);
            }
            n--;
        }
        System.out.println("Negativ:");
        negativ.stream().forEach(System.out::println);
        System.out.println("----------------------");
        System.out.println("Paros:");
        paros.stream().forEach(System.out::println);
    }

    public static void maxTerm() {
        List<Szam> term = new ArrayList<>();
        int n = 20;
        while (n > 0) {
            TermeszetesSzam tsz = new TermeszetesSzam(Double.toString(Math.floor(Math.random() * 100)));
            term.add(tsz);
            n--;
        }
        System.out.println("--------------------------");
        System.out.println("Legnagyobb: ");
        term.stream().map(s -> s.getValue()).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
    }

    public static List<Integer> paros(int n) {
       /* List<Integer> paros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                paros.add(i);
            }
        }
        return paros;*/

        List<Integer> paros = IntStream.range(1, n).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        return paros;
    }

    public static List<Integer> concat(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = Stream.concat(l1.stream(), l2.stream()).distinct().collect(Collectors.toList());
        return result;
    }

    public static Map<String, Boolean> existCheck(String[] files, String path) {
        Map<String, Boolean> map = new HashMap<>();
/*        for (int i = 0; i < files.length; i++) {
            Path p = Paths.get(path + "/" + files[i]);
            map.put(files[i], Files.exists(p));
        }*/

        Stream.of(files).forEach(
                i -> {
                    Path p = Paths.get(path + "/" + i);
                    map.put(i, Files.exists(p));
                }
        );
        return map;
    }

}
