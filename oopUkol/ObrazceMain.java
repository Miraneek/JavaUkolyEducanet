package oopUkol;

public class ObrazceMain {
    public static void main(String[] args) {
        Obrazec[] tvary = new Obrazec[5];
        tvary[0] = new RovnostrannyTrojuhelnik(6);
        tvary[1] = new Kruh(3.5);
        tvary[2] = new Ctverec(2);
        tvary[3] = new Obdelnik(4, 11);
        tvary[4] = new Obdelnik(5, 5);

        for (Obrazec o: tvary)
            System.out.println(o);
    }

}
