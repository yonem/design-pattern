package jp.ne.yonem.pattern.Command.A1;

import jp.ne.yonem.pattern.Command.Sample.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("�t�H�[���̋N��")
    void test1() {
        new Main("Command Pattern Sample");
    }
}