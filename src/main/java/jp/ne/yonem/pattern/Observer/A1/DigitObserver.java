package jp.ne.yonem.pattern.Observer.A1;

public class DigitObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        
        try {
            Thread.sleep(100);

        } catch (InterruptedException ignored) {
        }
    }
}
