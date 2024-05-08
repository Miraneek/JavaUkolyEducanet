package zeme;

public class Country {
    String name;
    String continent;
    int area;
    int population;
    long gdp;

    public Country(String line) {
        String[] splitted = line.split(",");
        name = splitted[0];
        continent = splitted[1];
        area = Integer.parseInt(splitted[2]);
        population = Integer.parseInt(splitted[3]);
        gdp = Long.parseLong(splitted[4]);
    }
}
