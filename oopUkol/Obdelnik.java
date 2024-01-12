package oopUkol;

public class Obdelnik extends Obrazec {
    private double strana2;

    public Obdelnik(double strana1, double strana2) {
        this.strana = strana1;
        strana2 = strana2;
        this.obvod = 2 * (strana1 + strana2);
        this.obsah = strana1 * strana2;
        jmeno = "Obdelnik";
    }

    @Override
    public String toString() {
        return String.format("Jsem %s se stranami A = %.1f a B = %.1f, s obvodem %.1f a obsahem %.1f", jmeno, strana, strana2, obvod, obsah);
    }
}
