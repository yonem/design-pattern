package jp.ne.yonem.pattern.Observer.Sample;

public class DigitObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());

        try {
            Thread.sleep(100);

        } catch (InterruptedException ignore) {
        }
    }
}
