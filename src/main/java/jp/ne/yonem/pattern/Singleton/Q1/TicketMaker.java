package jp.ne.yonem.pattern.Singleton.Q1;

public class TicketMaker {
    
    private int ticket = 1000;

    public int getNextTicketNumber() {
        return ticket++;
    }
}
