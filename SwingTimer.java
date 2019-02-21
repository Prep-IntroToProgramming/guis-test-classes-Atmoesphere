import javax.swing.*;
import java.awt.event.*; 
public class SwingTimer implements ActionListener{
    JLabel label;
    JFrame frame;
    int sec; 
    public SwingTimer(){
        frame = new JFrame(); 
        label = new JLabel();
        frame.add(label);
        int period = 1000;// 1 sec in ms 
        Timer myTimer = new Timer(period, new SwingTimer());
      
    }
    
    public static void main(String[] args){
        SwingTimer test = new SwingTimer();
    }
    
    @Override 
    public void actionPerformed(ActionEvent a){
    }
}