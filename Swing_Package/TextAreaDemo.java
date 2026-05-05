
import javax.swing.*;

public class TextAreaDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea Example");
        JTextArea area = new JTextArea();
        frame.setLayout(null);
        area.setBounds(50, 50, 250, 120);
        frame.add(area);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}