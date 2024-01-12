package oopUkol;

import oopUkol.Obrazec;

public class Kruh extends Obrazec {
    private double polomer;

    public Kruh(double polomer) {
        this.polomer = polomer;
    }

    @Override
    public String toString() {
        return String.format("Kruh s polomerem %.1f, s obvodem %.1f a obsahem %.1f", polomer, 2 * Math.PI * polomer, Math.PI * polomer * polomer);
    }
}