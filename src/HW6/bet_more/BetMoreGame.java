package HW6.bet_more;

public class BetMoreGame {
    private Shuffle s;

    public BetMoreGame() {
        s = new Shuffle();
    }
    public int play() {
        return s.pickCard();
    }

    public Player findWinner(Player system, Player player_2) {
        if (system.getNumber() > player_2.getNumber()) return system;
        return player_2;
    }
}
