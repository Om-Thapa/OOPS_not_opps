import javax.swing.*;

public class LabelButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components");
        JLabel label = new JLabel("Welcome to Java Swing");
        JButton button = new JButton("Click Me");
        frame.setLayout(null);
        label.setBounds(100, 50, 200, 30);
        button.setBounds(120, 100, 120, 30);
        frame.add(label);
        frame.add(button);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}