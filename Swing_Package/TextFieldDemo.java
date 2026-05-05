
import javax.swing.*;
import java.awt.event.*;

public class TextFieldDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Demo");
        JTextField tf = new JTextField();
        JButton btn = new JButton("Show");
        JLabel lbl = new JLabel();
        frame.setLayout(null);
        tf.setBounds(50, 50, 150, 30);
        btn.setBounds(220, 50, 80, 30);
        lbl.setBounds(50, 100, 250, 30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("You entered: " + tf.getText());
            }
        });
        frame.add(tf);
        frame.add(btn);
        frame.add(lbl);
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
