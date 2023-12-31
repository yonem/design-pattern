package jp.ne.yonem.pattern.Mediator.Sample;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  // コンストラクタ
        super(caption, group, state);
    }

    public void setMediator(Mediator mediator) {            // Mediatorを保持
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {      // Mediatorから有効/無効が指示される
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e) {             // 状態が変化したらMediatorに通知
        mediator.colleagueChanged();
    }
}
