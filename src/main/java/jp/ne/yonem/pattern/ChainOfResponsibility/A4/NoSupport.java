package jp.ne.yonem.pattern.ChainOfResponsibility.A4;

public class NoSupport extends Support {
    
    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {     // 解決用メソッド
        return false; // 自分は何も処理しない
    }
}
