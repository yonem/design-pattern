package jp.ne.yonem.pattern.Singleton.A3_1;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("インスタンスを生成しました。");
        slowdown();
    }

    public static Singleton getInstance() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

    private void slowdown() {

        try {
            Thread.sleep(1000);

        } catch (InterruptedException ignored) {
        }
    }
}
