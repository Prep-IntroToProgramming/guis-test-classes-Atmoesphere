import javax.swing.*;
import java.awt.event.*; 
public class SwingTimer implements ActionListener{
    JLabel label;
    JFrame frame;
    int sec; 
    Timer myTimer;
    public SwingTimer(){
        frame = new JFrame(); 
        label = new JLabel();
        frame.add(label);
        int period = 1000;// 1 sec in ms 
        myTimer = new Timer(period, new TimeListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myTimer.start();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    class TimeListener implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent w){
            sec++;
            if(sec == 5){
                myTimer.stop();
            }
            label.setText(sec+"");
        }
    }

    public static void main(String[] args){
        SwingTimer test = new SwingTimer();
    }

    @Override 
    public void actionPerformed(ActionEvent a){
    }
}