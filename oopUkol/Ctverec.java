package oopUkol;

import java.text.DecimalFormat;

public class Ctverec extends Obrazec {
    private double strana;

    public Ctverec(double strana) {
        this.strana = strana;
    }

    @Override
    public String toString() {

        double obvod = 4 * strana;
        double obsah = strana * strana;

        return String.format("Jsem ctverec s stranou %.1f, s obvodem %.1f a obsahem %.1f",
                strana, obvod, obsah);
    }
}
