package nested.anonymous.ex07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnClickListener extends JFrame {

    private JButton button;

    public OnClickListener() {
        this.setTitle("버튼 이벤트");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("버튼을 클릭하세요.");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("버튼을 클릭하세요.")) {
                    button.setText("클릭되었습니다!");
                } else {
                    button.setText("버튼을 클릭하세요.");
                }
            }
        });

        this.add(button);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new OnClickListener();
    }
}
