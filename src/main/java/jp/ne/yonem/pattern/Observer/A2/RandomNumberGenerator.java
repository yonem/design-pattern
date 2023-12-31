package jp.ne.yonem.pattern.Observer.A2;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private final Random random = new Random();   // 乱数生成機
    private int number;                     // 現在の数

    public int getNumber() {                // 数を取得する
        return number;
    }

    public void execute() {

        for (var i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
