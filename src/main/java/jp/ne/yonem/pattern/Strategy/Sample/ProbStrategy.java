package jp.ne.yonem.pattern.Strategy.Sample;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private final Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private final int[][] history = {
            {1, 1, 1,},
            {1, 1, 1,},
            {1, 1, 1,},
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        var bet = random.nextInt(getSum(currentHandValue));
        int handValue;

        if (bet < history[currentHandValue][0]) {
            handValue = 0;

        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;

        } else {
            handValue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        var sum = 0;

        for (var i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
