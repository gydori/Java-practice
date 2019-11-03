import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityReader {
    public static List<City> readCities(String path) {
        List<City> list = new ArrayList<>();
        try {
            URL url = new URL(path);
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String[] arr = sc.nextLine().split("\\t");
                list.add(new City(Integer.parseInt(arr[0].startsWith("\uFEFF") ? arr[0].substring(1) : arr[0]), arr[1], new Location(arr[3], arr[4]), Integer.parseInt(arr[8])));
            }
            return list;

            /*list = Files.lines(Paths.get(path)).map(s -> {
                String[] arr = s.split("\\t");
                return new City(Integer.parseInt(arr[0].startsWith("\uFEFF") ? arr[0].substring(1) : arr[0]), arr[1], new Location(arr[3], arr[4]), Integer.parseInt(arr[8]));
            }).collect(Collectors.toList());
            return list;*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
