package jp.ne.yonem.pattern.TemplateMethod.Sample;

public class StringDisplay extends AbstractDisplay {    // StringDisplayも、AbstractDisplayのサブクラス。
    
    private final String string;                        // 表示するべき文字列。
    private final int width;                            // バイト単位で計算した文字列の「幅」。

    public StringDisplay(String string) {               // コンストラクタで渡された文字列stringを、
        this.string = string;                           // フィールドに記憶。
        this.width = string.getBytes().length;          // それからバイト単位の幅もフィールドに記憶しておいて、後で使う。
    }

    public void open() {                                // オーバーライドして定義するopenメソッド。
        printLine();                                    // このクラスのメソッドprintLineで線を引いている。
    }

    public void print() {                               // printメソッドは、
        System.out.println("|" + string + "|");         // フィールドに記憶しておいた文字列の前後に"|"をつけて表示。
    }

    public void close() {                               // closeメソッドは、
        printLine();                                    // openと同じくprintLineメソッドで線を引いている。
    }

    private void printLine() {                          // openとcloseから呼ばれるprintLineメソッドだ。privateなので、このクラスの中だけで使われる。
        System.out.print("+");                          // 枠の角を表現する"+"マークを表示。

        // width個の"-"を表示して、枠線として用いる。
        for (var i = 0; i < width; i++) System.out.print("-");
        System.out.println("+");                        // 枠の角を表現する"+"マークを表示。
    }
}
