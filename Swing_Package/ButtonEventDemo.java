
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        JButton button = new JButton("Click");
        JLabel label = new JLabel();
        frame.setLayout(null);
        button.setBounds(100, 50, 100, 30);
        label.setBounds(100, 100, 200, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
        frame.add(button);
        frame.add(label);
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
