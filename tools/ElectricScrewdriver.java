package tools;

public class ElectricScrewdriver extends Screwdriver {

    private int bateryLife;

    public ElectricScrewdriver(int weight, String name, int bateryLife) {
        super(weight, name);
        this.bateryLife = bateryLife > 100 ? 100 : Math.max(bateryLife, 0);
        working = String.format("Screwing and turning but electrically and I have %d percent of batery left and my name is %s", bateryLife, name);
    }
}
