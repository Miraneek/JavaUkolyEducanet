package oopUkol;

public abstract class Obrazec {
    String jmeno = "Obrazec Jmeno";
    double strana = 0;
    double obvod = 0;
    double obsah = 0;
    public Obrazec() {

    }

    @Override
    public String toString() {
        return String.format("Jsem %s s stranou %.1f, s obvodem %.1f a obsahem %.1f",jmeno, strana, obvod, obsah);
    }
}
