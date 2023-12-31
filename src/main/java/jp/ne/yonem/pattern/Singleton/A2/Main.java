package jp.ne.yonem.pattern.Singleton.A2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");

        for (var i = 0; i < 9; i++) {
            var triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
