import javax.swing.*;
import java.awt.*;

public class TestPaintButton{
    JFrame frame; 
    public TestPaintButton(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PaintedPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
         TestPaintButton x = new TestPaintButton();
    }
}

