import javax.swing.*;
import java.awt.*;
public class drawdesign extends JButton{
public int x = 70;
public int y = 70; 
    @Override 
    public void paintComponent(Graphics g){
       g.setColor(Color.black);
       g.fillRect(0, 0, this.getWidth(), this.getHeight());
       g.setColor(Color.green);
       g.fillOval(x, y, 100, 100);
}
}