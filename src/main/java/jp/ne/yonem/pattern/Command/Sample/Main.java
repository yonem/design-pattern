package jp.ne.yonem.pattern.Command.Sample;

import jp.ne.yonem.pattern.Command.Sample.command.MacroCommand;
import jp.ne.yonem.pattern.Command.Sample.drawer.DrawCanvas;
import jp.ne.yonem.pattern.Command.Sample.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    // 描画履歴
    private final MacroCommand history = new MacroCommand();

    // 描画領域
    private final DrawCanvas canvas = new DrawCanvas(800, 500, history);
    
    // 消去ボタン
    private final JButton clearButton = new JButton("clear");

    // コンストラクタ
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
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

    // MouseMotionListener用
    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        var cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener用
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
