import javax.swing.*;
import java.awt.*;
public class PlayerCar {
    Image img = new ImageIcon("res/Car1.png").getImage();
    public int x = 315;
    public int y = 430;

    public int speed = 2;
    public int way = 0;


    public int label1 = 0;
    public void move(){
        way+=speed;
        y-=speed;

    }

}
