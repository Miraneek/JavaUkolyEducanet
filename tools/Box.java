package tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {

    private int maxWeight;
    private int weightOfToolsInside;
    ArrayList<Tool> toolsInside = new ArrayList<>();

    public Box(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addTool(Tool tool) {
        if (tool.weight + weightOfToolsInside <= maxWeight) {
            this.toolsInside.add(tool);
            this.weightOfToolsInside += tool.weight;
        } else {
            System.out.println("Tool is too heavy");
        }
    }

    public void removeTool(String name) {
        for (int i = 0; i < toolsInside.size(); i++) {
            if (toolsInside.get(i).name.equals(name)) {
                this.toolsInside.remove(i);
                this.weightOfToolsInside -= toolsInside.get(i).weight;
                i--;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Tools in the box: ");
        for (Tool tool : toolsInside) {
            output.append(tool.name).append(", ");
        }
        return output.toString();
    }

    public List<Tool> getNastroje() {
        return Collections.unmodifiableList(toolsInside);
    }

    public int getWeightOfAllBothHandedHammers() {
        int weight = 0;
        for (Tool tool : toolsInside) {
            if (tool instanceof Hammer && ((Hammer) tool).getIsBothHanded()) {
                weight += tool.weight;
            }
        }
        return weight;
    }

    public Tool getTool(String name) {
        for (Tool tool : toolsInside) {
            if (tool.name.equals(name)) {
                return tool;
            }
        }
        return null;
    }

}
