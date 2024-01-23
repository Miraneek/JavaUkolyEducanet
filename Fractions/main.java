package Fractions;

public class main {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        System.out.println(Fraction.addFractions(fraction1, fraction2).getReal());
    }
}
