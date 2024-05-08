package zeme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        World world = new World("zeme/world.csv");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to do with data about the world?");
            System.out.println("1) Print countries with population greater than 180 million");
            System.out.println("2) Print population by continent");
            System.out.println("3) Print average GDP for countries above 1 billion in population");
            System.out.println("4) Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    world.printCountriesWithPopulationGreaterThan(180_000_000);
                    break;
                case "2":
                    System.out.println("Enter continent:");
                    String continent = scanner.nextLine().trim();
                    int population = world.printPopulationByContinent(continent);
                    System.out.println("Population in " + continent + ": " + population);
                    break;
                case "3":
                    long gdp = world.avarageGdpForCountriesAbove1BillionInPopulation();
                    System.out.println("Average GDP for countries above 1 billion in population: " + gdp);
                    break;
                case "4":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
            System.out.println("press enter to continue");
            scanner.nextLine();
            // clear screen
            for (int i = 0; i < 400; i++) {
                System.out.println();
            }
        }
    }
}
