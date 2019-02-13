 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ChallengeGui implements ActionListener{
    JFrame frame;
    JButton button1;
    JButton button2;
    public ChallengeGui(){
        frame = new JFrame();
        button1 = new JButton("1");
        button2 = new JButton("2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.EAST, button1);
        frame.add(BorderLayout.WEST, button2);
        frame.setSize(500,500);
        frame.setVisible(true);
        button1.addActionListener(new ButtonOneListener());
        button2.addActionListener(new ButtonTwoListener());
    }
    class ButtonOneListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            button1.setText("hi button 1");
        }
    }
    class ButtonTwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            button2.setText("hi button 2");
        }
    }
    public static void main(String[] args){
        ChallengeGui x = new ChallengeGui();
    }

    public void actionPerformed(ActionEvent e){
        button1.setText("hi");
    }
    
}
	
	
	
