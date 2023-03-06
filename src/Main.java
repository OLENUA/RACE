import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Real Racer");
        f.setSize(514,601);
        f.add(new road());
        f.setVisible(true);
    }
}