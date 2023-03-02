import javax.swing.*;
import java.awt.*;

public class road extends JPanel {
    Image img = new ImageIcon("res/map.png").getImage();
    private Graphics2D g;

    public void paint(Graphics2D g){
        this.g = g;
        g.drawImage(img, 0,0,null);
    }
}
