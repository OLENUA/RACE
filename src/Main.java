import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Real Racer");
        frame.setSize(514,601);
        frame.setVisible(true);
        frame.add(new road());
    }
}