package jp.ne.yonem.pattern.TemplateMethod.Sample;

public abstract class AbstractDisplay { // 抽象クラスAbstractDisplay

    public abstract void open();        // サブクラスに実装をまかせる抽象メソッド(1) open

    public abstract void print();       // サブクラスに実装をまかせる抽象メソッド(2) print

    public abstract void close();       // サブクラスに実装をまかせる抽象メソッド(3) close

    public final void display() {       // この抽象クラスで実装しているメソッドdisplay
        open();                         // まずopenして…

        // 5回printを繰り返して…
        for (var i = 0; i < 5; i++) print();
        close();                        // …最後にcloseする。これがdisplayメソッドで実装されている内容。
    }
}
