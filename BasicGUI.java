
import javax.swing.*;
import java.awt.*;
 

public class BasicGUI { 
    public BasicGUI(){
        JFrame frame = new JFrame();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.NORTH,button1);
        frame.add(BorderLayout.SOUTH,button2);
        frame.add(BorderLayout.CENTER,button3);
        frame.add(BorderLayout.EAST,button4);
        frame.add(BorderLayout.WEST,button5);
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        BasicGUI gui= new BasicGUI();
    }
} 