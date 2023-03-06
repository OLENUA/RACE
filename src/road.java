import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class road extends JPanel implements ActionListener {
    Image img = new ImageIcon("res/map.png").getImage();
    PlayerCar p = new PlayerCar();
    Timer mainTimer = new Timer(20,this) ;
    public void paint(Graphics g) {
        g.drawImage(img, p.label1,0,null);
        g.drawImage(p.img, p.x , p.y , null);
    }

    public road(){
        mainTimer.start();
    }
    public void actionPerformed(ActionEvent event){
        p.move();
        repaint();
    }
}
