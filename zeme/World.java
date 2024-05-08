package zeme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class World {

    private final HashMap<String, Country> countries = new HashMap<>();

    public World(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            scanner.nextLine();
            while (scanner.hasNextLine()){
                Country country = new Country(scanner.nextLine());
                countries.put(country.name, country);
            }
            System.out.println("Countries loaded: " + countries.size());
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void printCountriesWithPopulationGreaterThan(int population) {
        List<Country> countries = new ArrayList<>();
        for (Country country : this.countries.values()) {
            if (country.population > population) {
                countries.add(country);
            }
        }
        for (Country country : countries) {
            System.out.println(country.name);
        }
    }

    public int printPopulationByContinent(String continent) {
        int population = 0;
        for (Country country : countries.values()) {
            if (country.continent.equals(continent)) {
                population += country.population;
            }
        }
        return population;
    }

    public long avarageGdpForCountriesAbove1BillionInPopulation() {
        long sum = 0;
        int count = 0;
        for (Country country : countries.values()) {
            if (country.gdp > 1000000000000L) {
                sum += country.gdp;
                count++;
            }
        }
        return sum / count;
    }

}
