package oopUkol;

public class RovnostrannyTrojuhelnik extends Obrazec{

    public RovnostrannyTrojuhelnik(double strana) {
        this.strana = strana;
        obvod = 3 * strana;
        obsah =(Math.sqrt(3) / 4) * Math.pow(strana, 2);
        jmeno = "Rovnostranny Trojuhelnik";
    }
}
