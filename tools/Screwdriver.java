package tools;

public class Screwdriver extends Tool {
    public Screwdriver(int weight, String name) {
        super(weight, name);
        working = "Screwing and turning and my name is " + name;
    }
}
