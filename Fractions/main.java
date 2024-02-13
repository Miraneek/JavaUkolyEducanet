package Fractions;

public class main {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(-6, -8);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction.multiplyFractions(fraction1, fraction2);
        Fraction.addFractions(fraction1, fraction2);
        Fraction.subtractFractions(fraction1, fraction2);
        Fraction.divideFractions(fraction1, fraction2);
        Fraction.Reciprocal(fraction1);
    }
}
