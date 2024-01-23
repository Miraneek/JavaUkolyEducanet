package Fractions;

public class NSDcalculator {
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0 && b == 0) {
            // Největší společný dělitel není definován pro nuly
            return -1;
        }

        // Použití Eukleidova algoritmu pro výpočet NSD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Pokud výsledné a není nula, vrátíme absolutní hodnotu (v případě záporných čísel)
        return Math.abs(a);
    }
}
