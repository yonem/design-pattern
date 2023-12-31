package jp.ne.yonem.pattern.Strategy.Sample;

public class Main {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Main randomSeed1 randomSeed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        var seed1 = Integer.parseInt(args[0]);
        var seed2 = Integer.parseInt(args[1]);
        var player1 = new Player("Taro", new WinningStrategy(seed1));
        var player2 = new Player("Hana", new ProbStrategy(seed2));

        for (var i = 0; i < 10_000; i++) {
            var nextHand1 = player1.nextHand();
            var nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();

            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();

            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
