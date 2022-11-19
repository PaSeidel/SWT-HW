package HW6.bet_more;

import java.util.Random;

public class Shuffle {

    public int pickCard() {
        Random random = new Random();
        return random.nextInt(101 - 1) + 1;
    }
}
