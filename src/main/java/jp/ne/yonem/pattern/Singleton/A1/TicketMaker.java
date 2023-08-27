package jp.ne.yonem.pattern.Singleton.A1;

public class TicketMaker {
    private int ticket = 1000;
    private static final TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
