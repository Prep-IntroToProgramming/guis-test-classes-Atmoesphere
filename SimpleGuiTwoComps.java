
import javax.swing.*;
import java.awt.*;

public class SimpleGuiTwoComps{
    JFrame frame; 
    public SimpleGuiTwoComps(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PaintedPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
         TestPaintPanel x = new TestPaintPanel();
    }
}