package jp.ne.yonem.pattern.Flyweight.A2;

public class BigString {

    // 「大きな文字」の配列
    private BigChar[] bigchars;

    // コンストラクタ
    public BigString(String string) {
        initShared(string);
    }

    // コンストラクタ
    public BigString(String string, boolean shared) {

        if (shared) {
            initShared(string);

        } else {
            initUnshared(string);
        }
    }

    // 共有して初期化
    private void initShared(String string) {
        bigchars = new BigChar[string.length()];
        var factory = BigCharFactory.getInstance();

        for (var i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 共有せず初期化
    private void initUnshared(String string) {
        bigchars = new BigChar[string.length()];

        for (var i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));
        }
    }

    // 表示
    public void print() {
        for (BigChar bigchar : bigchars) bigchar.print();
    }
}
