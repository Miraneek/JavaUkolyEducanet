package Fractions;

public class NSDcalculator {
    /**
     * Calculates the greatest common divisor of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The greatest common divisor, if both a and b are not zero, -1 otherwise
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0 && b == 0) {
            // Handles if both a and b are zero
            return -1;
        }

        // using Euclid's algorithm to calculate the greatest common divisor
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // If the resulting "a" is not zero, return the absolute value (in the case of negative numbers)
        return Math.abs(a);
    }
}
