package LOGIK;

import java.util.Objects;

public class Number {
    private final String winningNumber;

    public Number(int numberOfDigits) {
        int digits = (int) Math.pow(10, numberOfDigits + 1) - 1;
        winningNumber = String.valueOf(Math.random() * digits);
    }

    public Result checkNumber(String number){
        if (winningNumber.length() != number.length()){
            throw new IllegalArgumentException("Numbers must have same length");
        }
        if (Objects.equals(winningNumber, number)) {
            return new Result(4,0);
        }
        String[] winningNumberArray = winningNumber.split("");
        String[] numberArray = number.split("");
        int samePlace = 0;

        for (int i = 0; i < winningNumber.length(); i++) {
            if (Objects.equals(winningNumberArray[i], numberArray[i])) {
                winningNumberArray[i] = "wqerzuiop";
                numberArray[i] = "sydxfcghjkl";
                samePlace++;
            }
        }

        int differentPlace = 0;
        for (int i = 0; i < winningNumber.length(); i++) {
            for (String s : winningNumberArray) {
                if (numberArray[i].contains(s)) {
                    differentPlace++;
                }
            }
        }

        return new Result(samePlace, differentPlace);
    }
}
