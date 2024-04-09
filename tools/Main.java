package tools;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10000);
        box.addTool(new Hammer(1000, "Small hammer", false));
        box.addTool(new Hammer(3000, "Big hammer", true));
        box.addTool(new Hammer(2000, "Hammer destroyer", false));
        box.addTool(new Screwdriver(500, "Philips screwdriver"));
        box.addTool(new Saw(2000, "Rusty saw"));
        box.addTool(new ElectricScrewdriver(1000, "Bosh screwdriver", 50));
        System.out.println(box);
        System.out.println();
        box.removeTool("Rusty saw");
        box.removeTool("Rusty saw");
        box.removeTool("Small hammer");
        box.removeTool("Philips screwdriver");
        System.out.println(box);

        box.addTool(new Saw(2000, "Rusty saw"));

        box.getTool("Big hammer").work();
        box.getTool("Hammer destroyer").work();
        box.getTool("Bosh screwdriver").work();
        box.getTool("Rusty saw").work();

        System.out.println(box.getNumberOfBothHandedHammers());

    }
}
