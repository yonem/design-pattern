package jp.ne.yonem.pattern.Observer.Sample;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    private final List<Observer> observers = new ArrayList<>();        // Observer������ێ�

    public void addObserver(Observer observer) {    // Observer��ǉ�
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observer���폜
        observers.remove(observer);
    }

    public void notifyObservers() {               // Observer�֒ʒm

        for (var observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();                // �����擾����

    public abstract void execute();                 // ���𐶐�����
}
