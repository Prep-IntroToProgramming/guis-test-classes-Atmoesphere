import javax.swing.*;

public class SimpleGui2{ 
    public SimpleGui2() {
        JFrame frame = new JFrame();// new j frame created
        ImagePanel panel = new ImagePanel();// new image panel created
 
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        //frame.add(panel2);
        //frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
    }
} 
