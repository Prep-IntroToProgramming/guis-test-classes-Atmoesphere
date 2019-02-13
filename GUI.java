

import javax.swing.*;
import java.awt.event.*;
public class GUI implements ActionListener{ 
    JFrame frame;
    JButton button;
    int size = 1000;
    public GUI() {
        button = new JButton("click here");
        frame = new JFrame();// new j frame created
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(size, size);
        frame.setVisible(true);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){ 
        size = size/2;
        frame.setSize(size, size);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
} 

