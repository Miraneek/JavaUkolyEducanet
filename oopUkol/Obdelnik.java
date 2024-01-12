package oopUkol;

public class Obdelnik extends Obrazec {
    private double stranaA;
    private double stranaB;

    public Obdelnik(double stranaA, double stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }

    @Override
    public String toString() {
        return String.format("Jsem obdelnik s stranami %.1f a %.1f, s obvodem %.1f a obsahem %.1f", stranaA, stranaB, 2 * (stranaA + stranaB), stranaA * stranaB);
    }
}
