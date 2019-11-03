import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gezemice {
    public static List<Kozos> tarolo = new ArrayList<>();

    public static void beolvas(String fajl) {
        try {
            tarolo = Files.lines(Paths.get(fajl)).map(s -> {
                String[] arr = s.split(";");
                switch (arr[0]) {
                    case "bor":
                        return new Bor(arr[1], arr[2], Double.parseDouble(arr[3].substring(0, arr[3].length() - 1)));
                    case "gyumolcsle":
                        return new Gyumolcsle(arr[1], arr[2], arr[3]);
                    case "borso":
                        return new FalraHanytBorso(Double.parseDouble(arr[1].substring(0, arr[1].length() - 1)), arr[2]);
                    default:
                        return null;
                }
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leltar() {
        System.out.println(tarolo);
    }

    public static void main(String[] args) {
        beolvas("kozos.txt");
        leltar();
    }
}
