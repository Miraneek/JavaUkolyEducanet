package oopUkol;

public class RovnostrannyTrojuhelnik extends Obrazec{
    private double hranaDelka;
    public RovnostrannyTrojuhelnik(double hranaDelka) {
        this.hranaDelka = hranaDelka;
    }

    @Override
    public String toString() {
        return String.format("Jsem rovnostranný trojúhelník s hranou %.1f, s obvodem %.1f a obsahem %.1f", hranaDelka, hranaDelka*3, (Math.sqrt(3) / 4) * Math.pow(hranaDelka, 2));
    }
}
