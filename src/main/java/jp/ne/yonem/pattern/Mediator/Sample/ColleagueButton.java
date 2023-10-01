package jp.ne.yonem.pattern.Mediator.Sample;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    public void setMediator(Mediator mediator) {            // Mediator��ێ�
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {      // Mediator����L��/�������w�������
        setEnabled(enabled);
    }
}
