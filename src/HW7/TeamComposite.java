package HW7;

import java.util.ArrayList;
import java.util.List;

public class TeamComposite implements OlympicComponent{

    private List<OlympicComponent> children;
    private String name;


    public TeamComposite (String name) {
        children = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printNAthletes() {
        System.out.println(name);
        for (OlympicComponent team : children) {
            System.out.print("\t");
            team.printNAthletes();
        }
    }

    @Override
    public void printNGoldMedals() {
        System.out.println(name);
        for (OlympicComponent team : children) {
            System.out.print("\t");
            team.printNGoldMedals();
        }
    }

    public void addChild(OlympicComponent c) {
        children.add(c);
    }

    public boolean removeChild(OlympicComponent c) {
        return children.remove(c);
    }

    public List<OlympicComponent> getChildren () {
        return children;
    }
}
