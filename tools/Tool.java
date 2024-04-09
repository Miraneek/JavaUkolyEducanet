package tools;

public abstract class Tool {
    protected int weight;
    protected String name;
    protected String working = "";

    public Tool(int weight, String name) {
        this.name = name;
        this.weight = Math.max(weight, 0);
    }

    public void work() {
        System.out.println(working);
    }

}
