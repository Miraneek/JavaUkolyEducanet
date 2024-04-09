package tools;

public class Hammer extends Tool {
    private boolean isBothHanded;

    public Hammer(int weight, String name, boolean isBothHanded) {
        super(weight, name);
        this.isBothHanded = isBothHanded;
        working = String.format("Im hammering and striking and Im %s and my name is %s", isBothHanded ? "both handed" : "one handed", name);
    }

    public boolean getIsBothHanded(){
        return isBothHanded;
    }

}
