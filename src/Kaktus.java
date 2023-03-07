
import java.awt.*;
import javax.swing.ImageIcon;

public class Kaktus extends Thread {
    Image img = new ImageIcon("res/cactus.png").getImage();
    int x = 405;
    int y = 0;
    public int speed = 2;
    public int way = 0;

    public void move() {
        way += speed;
        y += speed;
    }

    public void kaktusSpawn(Graphics graphics) {
        while (true) {
            graphics.drawImage(img, x, y, null);
            try {
                Thread.sleep(400);
            } catch (InterruptedException w) {
                throw new RuntimeException(w);
            }
            if (x >= 600) {
                graphics.clipRect(405, 600, 106, 105);
            }
        }
    }
}


