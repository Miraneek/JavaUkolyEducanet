package tools;

public class Saw extends Tool {
    public Saw(int weight, String name) {
        super(weight, name);
        working = "Sawing and cutting and my name is " + name;
    }
}
