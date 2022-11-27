package HW7;

public class Main {
    public static void main(String[] args) {

        //  Initialization

        TeamComposite teams = new TeamComposite("2024 Olympics Teams");

        TeamComposite asia = new TeamComposite("Asia Team");
        TeamComposite europe = new TeamComposite("Europe Team");
        teams.addChild(asia);
        teams.addChild(new TeamLeaf("Africa Team", 34, 18));
        teams.addChild(europe);
        teams.addChild(new TeamLeaf("South America Team", 41, 23));

        TeamComposite china = new TeamComposite("China Team");
        TeamComposite germany = new TeamComposite("Germany Team");
        TeamComposite italy = new TeamComposite("Italy Team");
        asia.addChild(china);
        asia.addChild(new TeamLeaf("Afghanistan Team", 12, 4));
        europe.addChild(germany);
        europe.addChild(italy);

        TeamComposite chinaWomen = new TeamComposite("China Women's Team");
        TeamComposite chinaMen = new TeamComposite("China Men's Team");
        TeamComposite gerWomen = new TeamComposite("Germany Women's Team");
        TeamComposite gerMen = new TeamComposite("Germany Men's Team");
        TeamComposite italyWomen = new TeamComposite("Italy Women's Team");
        TeamComposite italyMen = new TeamComposite("Italy Men's Team");
        china.addChild(chinaWomen);
        china.addChild(chinaMen);
        germany.addChild(gerWomen);
        germany.addChild(gerMen);
        italy.addChild(italyWomen);
        italy.addChild(italyMen);

        chinaWomen.addChild(new TeamLeaf("Teakwondo", 4, 2));
        chinaWomen.addChild(new TeamLeaf("Waterpolo", 9, 3));
        chinaWomen.addChild(new TeamLeaf("Artistic Gymnastics", 6, 1));
        chinaMen.addChild(new TeamLeaf("Shooting", 7, 2));
        gerWomen.addChild(new TeamLeaf("Cycling", 6, 3));
        gerWomen.addChild(new TeamLeaf("Tennis", 3, 0));
        gerMen.addChild(new TeamLeaf("Table Tennis", 2, 1));
        gerMen.addChild(new TeamLeaf("Football", 15, 3));
        italyWomen.addChild(new TeamLeaf("Alpine Sky", 9, 3));
        italyMen.addChild(new TeamLeaf("Football", 16, 1));
        italyMen.addChild(new TeamLeaf("Swimming Team", 6, 0));

        // Outputs
        System.out.println("a");
        gerMen.printNAthletes();
        System.out.println("b");
        germany.printNGoldMedals();
        System.out.println("c");
        china.printNGoldMedals();
        System.out.println("d");
        teams.printNAthletes();


    }
}
