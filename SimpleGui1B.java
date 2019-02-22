import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ 
    JFrame frame;
    JButton button;
    int clicks; 
    public SimpleGui1B() {
        button = new JButton("click me");// adds text 
        frame = new JFrame();// creates new frame 

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        //frame.add(label);

        button.addActionListener(this);//adds a action listener to the button which i assume recognizes the event when it occurs 
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {// action event(response)
        //button.setText("I've been clicked!");// adds text response to an event
        clicks++;
        button.setText(clicks + "");
        if (clicks == 8){
            System.out.println("thats my fav number");
        }

    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }
} 
