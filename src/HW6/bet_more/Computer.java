package HW6.bet_more;

public class Computer extends Player{

    public Computer(BetMoreGame bet) {
        this.bet = bet;
    }

    @Override
    public int start() {
        this.number = bet.play();
        return this.number;
    }
}
