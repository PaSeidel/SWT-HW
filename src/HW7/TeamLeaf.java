package HW7;

public class TeamLeaf implements OlympicComponent{

    private String name;
    private int nAthletes;
    private int nGoldMedals;

    public TeamLeaf(String name, int nAthletes, int nGoldMedals) {
        this.name = name;
        this.nAthletes = nAthletes;
        this.nGoldMedals = nGoldMedals;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printNAthletes() {
        System.out.printf("Team: %s, Number of Athletes: %d%n", name, nAthletes);
    }

    @Override
    public void printNGoldMedals() {
        System.out.printf("Team: %s, Number of Gold Medals: %d", name, nGoldMedals);
    }

    public int getNumberOfAthletes() {
        return nAthletes;
    }

    public int getNumberOfGoldMedals() {
        return nGoldMedals;
    }
}
