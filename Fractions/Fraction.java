package Fractions;

public class Fraction {
    private final int citatel;
    private final int jmenovatel;

    public Fraction(int citatel, int jmenovatel) {
        this.citatel = citatel / NSDcalculator.greatestCommonDivisor(citatel, jmenovatel);
        this.jmenovatel = jmenovatel / NSDcalculator.greatestCommonDivisor(citatel, jmenovatel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return citatel == fraction.citatel && jmenovatel == fraction.jmenovatel;
    }

    public static Fraction addFractions(Fraction fraction1, Fraction fraction2) {
        if (fraction1.jmenovatel == fraction2.jmenovatel) {
            return new Fraction(fraction1.citatel + fraction2.citatel, fraction1.jmenovatel);
        } else {
            return new Fraction(fraction1.citatel * fraction2.jmenovatel + fraction2.citatel * fraction1.jmenovatel, fraction1.jmenovatel * fraction2.jmenovatel);
        }
    }

    public static Fraction subtractFractions(Fraction fraction1, Fraction fraction2) {
        if (fraction1.jmenovatel == fraction2.jmenovatel) {
            return new Fraction(fraction1.citatel - fraction2.citatel, fraction1.jmenovatel);
        } else {
            return new Fraction(fraction1.citatel * fraction2.jmenovatel - fraction2.citatel * fraction1.jmenovatel, fraction1.jmenovatel * fraction2.jmenovatel);
        }
    }

    public static Fraction multiplyFractions(Fraction fraction1, Fraction fraction2) {
        return new Fraction(fraction1.citatel * fraction2.citatel, fraction1.jmenovatel * fraction2.jmenovatel);
    }

    public static Fraction obratitHodnotu(Fraction fraction) {
        return new Fraction(fraction.jmenovatel, fraction.citatel);
    }

    public static Fraction divideFractions(Fraction fraction1, Fraction fraction2) {
        return Fraction.multiplyFractions(fraction1, Fraction.obratitHodnotu(fraction2));
    }



    @Override
    public int hashCode() {
        return citatel * 13 + jmenovatel;
    }

    public double getReal() {
        return (double) citatel / jmenovatel;
    }


    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }
}
