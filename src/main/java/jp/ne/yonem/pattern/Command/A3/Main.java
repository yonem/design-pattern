package jp.ne.yonem.pattern.Command.A3;

import jp.ne.yonem.pattern.Command.A3.command.Command;
import jp.ne.yonem.pattern.Command.A3.command.MacroCommand;
import jp.ne.yonem.pattern.Command.A3.drawer.DrawCanvas;
import jp.ne.yonem.pattern.Command.A3.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    // 描画履歴
    private final MacroCommand history = new MacroCommand();
    // 描画領域
    private final DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 消去ボタン
    private final JButton clearButton = new JButton("clear");

    // コンストラクタ
    public Main(String title) {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener(this);

        var buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        var mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // ActionListener用
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
