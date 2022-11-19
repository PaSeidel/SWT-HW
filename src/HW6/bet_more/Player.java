package HW6.bet_more;

abstract class Player {

    protected BetMoreGame bet;
    protected int number;
    public abstract int start();

    public int getNumber() {
        return number;
    }

}
