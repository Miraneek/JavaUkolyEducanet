package LOGIK;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDigits = 4;

        Number number = new Number(numberOfDigits);

        Result result = new Result(0, 0);

        while (result.getSamePlace() < 4) {
            System.out.printf("Guess a number (%d digits)", numberOfDigits);
            System.out.println();
            String guessNumber = scanner.nextLine();
            if (Objects.equals(guessNumber, "help")) {
                System.out.println("Guess a number that has " + numberOfDigits + " digits. The first number is how many numbers you guessed correctly and the second how many numbers are ina number but in the wrong place.");
                continue;
            }
            result = number.checkNumber(guessNumber);
            System.out.println(result);
        }

        System.out.println("YOU WIN!");
    }
}
