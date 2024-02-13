package Fractions;
/**
 * The Fraction class represents a mathematical fraction with a numerator and a denominator.
 * It provides methods for basic fraction operations such as addition, subtraction, multiplication, and division.
 * Fractions are automatically simplified to their simplest form during initialization.
 *
 * @author Miroslav Novotný
 * @version 2.0
 * @since 13.2.2024
 */

public class Fraction {
    /**
     * The numerator of the fraction.
     */
    private final int numerator;

    /**
     * The denominator of the fraction.
     */
    private final int denominator;

    /**
     * Constructs a Fraction object with the given numerator and denominator.
     * Automatically simplifies the fraction to its simplest form.
     * Handles negative numbers and fractions with a zero denominator.
     *
     * @param numerator   The numerator of the fraction.
     * @param denominator The denominator of the fraction.
     */
    public Fraction(int numerator, int denominator) {
        int nsd = NSDcalculator.greatestCommonDivisor(numerator, denominator);

        // handles negative numbers
        if (denominator < 0) {
            nsd = -nsd;
        }

        //handles fractions with zero denominator
        if (denominator == 0) {
            numerator = 0;
        }

        this.numerator = numerator / nsd;
        this.denominator = denominator / nsd;
    }

    @Override
    /**
     * Overrides the equals method to compare two Fraction objects for equality.
     *
     * @param o The object to compare with this Fraction.
     * @return True if the fractions are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    /**
     * Adds two Fraction objects.
     *
     * @param fraction1 The first fraction to add.
     * @param fraction2 The second fraction to add.
     * @return A new Fraction object representing the sum of the input fractions.
     */
    public static Fraction addFractions(Fraction fraction1, Fraction fraction2) {
        if (fraction1.denominator == fraction2.denominator) {
            return new Fraction(fraction1.numerator + fraction2.numerator, fraction1.denominator);
        } else {
            return new Fraction(fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator, fraction1.denominator * fraction2.denominator);
        }
    }

    /**
     * Subtracts one Fraction object from another.
     *
     * @param fraction1 The fraction to subtract from.
     * @param fraction2 The fraction to subtract.
     * @return A new Fraction object representing the result of the subtraction.
     */
    public static Fraction subtractFractions(Fraction fraction1, Fraction fraction2) {
        if (fraction1.denominator == fraction2.denominator) {
            return new Fraction(fraction1.numerator - fraction2.numerator, fraction1.denominator);
        } else {
            return new Fraction(fraction1.numerator * fraction2.denominator - fraction2.numerator * fraction1.denominator, fraction1.denominator * fraction2.denominator);
        }
    }

    /**
     * Multiplies two Fraction objects.
     *
     * @param fraction1 The first fraction to multiply.
     * @param fraction2 The second fraction to multiply.
     * @return A new Fraction object representing the product of the input fractions.
     */
    public static Fraction multiplyFractions(Fraction fraction1, Fraction fraction2) {
        return new Fraction(fraction1.numerator * fraction2.numerator, fraction1.denominator * fraction2.denominator);
    }

    /**
     * Calculates the reciprocal of a Fraction.
     *
     * @param fraction The fraction for which to find the reciprocal.
     * @return A new Fraction object representing the reciprocal of the input fraction.
     */
    public static Fraction Reciprocal(Fraction fraction) {
        return new Fraction(fraction.denominator, fraction.numerator);
    }

    /**
     * Divides one Fraction object by another.
     *
     * @param fraction1 The fraction to be divided.
     * @param fraction2 The divisor.
     * @return A new Fraction object representing the result of the division.
     */
    public static Fraction divideFractions(Fraction fraction1, Fraction fraction2) {
        return Fraction.multiplyFractions(fraction1, Fraction.Reciprocal(fraction2));
    }

    /**
     * Basic hashCode implementation.
     *
     * @return The hash code of the Fraction object.
     */
    @Override
    public int hashCode() {
        return numerator * 13 + denominator;
    }

    /**
     * Gives the real value of the Fraction.
     *
     * @return The real value of the Fraction in a double.
     */
    public double getReal() {
        return (double) numerator / denominator;
    }

    /**
     * Basic toString implementation.
     *
     * @return The string representation of the Fraction object in a "numerator/denominator" format. For example "3/4"
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
