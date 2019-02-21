
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGuiTwoComps implements ActionListener{
    JFrame frame; 
    JButton button;

    public SimpleGuiTwoComps(){
        frame = new JFrame();
        button = new JButton(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.NORTH,button);
        frame.add(BorderLayout.CENTER, new RandomPanel());
        button.addActionListener(this);
        //frame.add(new RandomPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        frame.repaint();
    }

    public static void main(String[] args){
        SimpleGuiTwoComps x = new SimpleGuiTwoComps();
    }
}