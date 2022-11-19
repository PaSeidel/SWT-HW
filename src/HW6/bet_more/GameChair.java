package HW6.bet_more;

public class GameChair {
    private Player computer;
    private Player player_2;
    private BetMoreGame bet;

    public GameChair() {
        bet = new BetMoreGame();
        computer = new Computer(bet);
        player_2 = new Human(bet);
    }

    public void playGame() {
        int computer_number = computer.start();
        int human_number = player_2.start();

        Player winner = bet.findWinner(computer, player_2);

        if (winner.equals(computer)) {
            System.out.println("The computer won!");
        } else {
            System.out.println("You won!");
        }
    }
}
