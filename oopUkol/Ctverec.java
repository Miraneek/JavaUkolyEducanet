package oopUkol;

import java.text.DecimalFormat;

public class Ctverec extends Obrazec {
    public Ctverec(double strana) {
        this.strana = strana;
        obvod = 4 * strana;
        obsah = strana * strana;
        jmeno = "Čtverec";
    }
}
