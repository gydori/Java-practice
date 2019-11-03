import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SZTEJegyzetbolt {
    static List<Konyv> konyvek = new ArrayList<>();
    static List<CD> cdk = new ArrayList<>();

    public static void main(String[] args) {
        rendelesFelvesz("rendel.txt");
        System.out.println(konyvek);
        System.out.println(cdk);
    }

    public static void rendelesFelvesz(String file) {
/*        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                switch (parts[0]) {
                    case "cd":
                        CD cd = new CD(parts[1], parts[2]);
                        cdk.add(cd);
                        break;
                    case "peldatar":
                        Peldatar pl = new Peldatar(parts[1], parts[2], Integer.parseInt(parts[3]));
                        konyvek.add(pl);
                        break;
                    case "regeny":
                        Regeny regeny = new Regeny(parts[1], parts[2], parts[3]);
                        konyvek.add(regeny);
                        break;
                }
            }*/
        try {
            Files.lines(Paths.get(file)).forEach(item -> {
                System.out.println(item);
            });
      /*      Files.lines(Paths.get(file)).map(s -> {
                String[] parts = s.split(";");
                System.out.println(parts[0]);
                switch (parts[0]) {
                    case "cd":
                        CD cd = new CD(parts[1], parts[2]);
                        cdk.add(cd);
                        return cdk;
                    case "peldatar":
                        Peldatar pl = new Peldatar(parts[1], parts[2], Integer.parseInt(parts[3]));
                        konyvek.add(pl);
                        return konyvek;
                    case "regeny":
                        Regeny regeny = new Regeny(parts[1], parts[2], parts[3]);
                        konyvek.add(regeny);
                        return konyvek;
                }
                return null;
            });*/


        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void rendelKonyv(List<Konyv> konyvek) {
        for (int i = 0; i < konyvek.size(); i++) {
            if (konyvek.get(i) instanceof Regeny) {
                ((Regeny) konyvek.get(i)).rendel(2);
            }
        }
    }

    public static void rendelCD(List<CD> cdk) {
        for (int i = 0; i < cdk.size(); i++) {
            ((CD) cdk.get(i)).rendel(2);
        }
    }

}
