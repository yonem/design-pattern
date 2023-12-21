package jp.ne.yonem.pattern.Observer.A2;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    private final List<Observer> observers = new ArrayList<>();        // Observerたちを保持

    public void addObserver(Observer observer) {    // Observerを追加
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observerを削除
        observers.remove(observer);
    }

    public void notifyObservers() {               // Observerへ通知
        for (var observer : observers) observer.update(this);
    }

    public abstract int getNumber();                // 数を取得する

    public abstract void execute();                 // 数を生成する
}
