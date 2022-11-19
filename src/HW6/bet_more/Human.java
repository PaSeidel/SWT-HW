package HW6.bet_more;

import java.util.Scanner;

public class Human extends Player {

    private Scanner in = new Scanner(System.in);

    public Human(BetMoreGame bet) {
        this.bet = bet;
    }
    @Override
    public int start() {
        boolean user_selected = false;
        int i = 0;
        while(!user_selected) {
            i++;
            this.number = bet.play();
            if (!rerollDecision(this.number)) {
                user_selected = true;
            }
            if(i==5) user_selected = true;
        }
        return this.number;
    }

    private boolean rerollDecision(int rolledNumber) {
        while (true) {
            System.out.println("Your number is "+rolledNumber+". Do you want to to reroll? (y/n)");
            String s = in.nextLine();
            switch (s) {
                case "y":
                    return true;
                case "n":
                    return false;
                default:
                    break;
            }
        }
    }
}
