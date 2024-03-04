package Fractions;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("gimme birthday: ");
        /*
        Počítá s tím, že uživetel napíše správne datum narození.
         */
        Fraction birthDay = getDateFraction();

        System.out.println("gimme nameday: ");
        Fraction nameday = getDateFraction();

        Fraction horniMez = birthDay.getReal() > nameday.getReal() ? birthDay : nameday;
        Fraction dolniMez = birthDay.getReal() < nameday.getReal() ? birthDay : nameday;

        if (horniMez.equals(dolniMez)) {
            horniMez = new Fraction(dolniMez.getNumerator() + 7, dolniMez.getDenominator() + 11);
        }

        System.out.println("Napište náhodné číslo mezi 5000 a 10000 obsahující den narození (Například když jsem se narodil 12., můžu si jako x zvolit 7012, 5412 apod.): ");
        int randomNumber = Integer.parseInt(scanner.nextLine());

        long startTime = System.currentTimeMillis();

        TreeSet<Fraction> fractionSet = new TreeSet<>();

        for (int i = 0; i <= randomNumber; i++) {
            for (int j = 0; j <= randomNumber; j++) {
                Fraction fraction = new Fraction(j, i);
                if (fraction.compareTo(horniMez) < 0 && fraction.compareTo(dolniMez) > 0) {
                    fractionSet.add(fraction);
                }
            }
        }

        try {
            System.out.printf("There are %d fractions between  %s and  %s with highest denominator %d. \n", fractionSet.size(), dolniMez, horniMez, fractionSet.last().getDenominator());
        } catch (NoSuchElementException e) {
            System.out.println("There are no fractions between  " + dolniMez + " and  " + horniMez);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTimeInSeconds = (endTime - startTime) / 1000;

        System.out.println("Time elapsed: " + elapsedTimeInSeconds + " seconds");

    }

    private static Fraction getDateFraction() {
        System.out.println("month: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("day: ");
        int day = Integer.parseInt(scanner.nextLine());

        if (day == month) {
            day++;
        }

        return new Fraction(Math.min(month, day), Math.max(month, day));
    }
}
