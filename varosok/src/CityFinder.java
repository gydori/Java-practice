import java.util.ArrayList;
import java.util.List;

public class CityFinder {
    private List<City> cityList;

    public CityFinder(String path) {
        this.cityList = CityReader.readCities(path);
    }


    public City getCityByName(String city) {
        for (City c : this.cityList) {
            if (city.toLowerCase().equals(c.getName().toLowerCase())) {
                return c;
            }
        }
        return null;
    }

    public List<City> getCitiesByPopulation(int min, int max) {
        List<City> popuCities = new ArrayList<>();
        for (City c : this.cityList) {
            if (c.getPopulation() > min && c.getPopulation() < max) {
                popuCities.add(c);
            }
        }
        return popuCities;
    }
}
