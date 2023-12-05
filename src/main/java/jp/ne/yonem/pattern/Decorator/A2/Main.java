package jp.ne.yonem.pattern.Decorator.A2;

public class Main {

    public static void main(String[] args) {
        var md = new MultiStringDisplay();
        md.add("���͂悤�������܂��B");
        md.add("����ɂ��́B");
        md.add("���₷�݂Ȃ����A�܂������B");
        md.show();

        var d1 = new SideBorder(md, '#');
        d1.show();

        var d2 = new FullBorder(md);
        d2.show();
    }
}
