package jp.ne.yonem.pattern.Decorator.A2;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private final List<String> body = new ArrayList<>();             // �\��������

    private int columns = 0;                        // �ő啶����

    public void add(String msg) {                   // ������ǉ�
        body.add(msg);
        updateColumn(msg);
    }

    public int getColumns() {                       // ������
        return columns;
    }

    public int getRows() {                          // �s��
        return body.size();
    }

    public String getRowText(int row) {             // �s�̓��e
        return body.get(row);
    }

    private void updateColumn(String msg) {         // ���������X�V����
        if (msg.getBytes().length > columns) columns = msg.getBytes().length;

        for (var row = 0; row < body.size(); row++) {
            var fills = columns - body.get(row).getBytes().length;
            if (fills > 0) body.set(row, body.get(row) + spaces(fills));
        }
    }

    private String spaces(int count) {              // �󔒍쐬
        return " ".repeat(Math.max(0, count));
    }
}
