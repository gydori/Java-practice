public class Main {
    public static void main(String[] args) {
        CityFinder cf = new CityFinder("http://webdraft.eu/orszagok_varosok/telepulesek.txt");
        System.out.println(cf.getCityByName("szombathely"));
        System.out.println(cf.getCitiesByPopulation(5000, 6000));
    }
}
