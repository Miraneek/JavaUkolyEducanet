package oopUkol;

import oopUkol.Obrazec;

public class Kruh extends Obrazec {
    private double polomer;
    public Kruh(double polomer) {
        this.polomer = polomer;
        obvod = 2 * Math.PI * polomer;
        obsah = Math.PI * Math.pow(polomer, 2);
        jmeno = "Kruh";
    }

    @Override
    public String toString() {
        return String.format("Jsem %s s pruměrem %.1f, s obvodem %.1f a obsahem %.1f",jmeno, strana, obvod, obsah);
    }
}