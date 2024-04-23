package LOGIK;

public class Result {
    private final int samePlace;
    private final int differentPlace;

    public Result(int samePlace, int differentPlace) {
        this.samePlace = samePlace;
        this.differentPlace = differentPlace;
    }

    public int getSamePlace() {
        return samePlace;
    }

    public int getDifferentPlace() {
        return differentPlace;
    }

    @Override
    public String toString() {
        return samePlace + "|" + differentPlace;
    }
}
