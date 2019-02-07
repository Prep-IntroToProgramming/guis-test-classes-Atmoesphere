import javax.swing.*;// new java import line 

public class SimpleGui1{ 
    public SimpleGui1() {
        JFrame frame = new JFrame();// creates window frame
        JButton button = new JButton("click me");// sets texts in the middle of the button
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);// adds a button
        //frame.add(label);
        frame.setSize(300, 300);// sets the frame size
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();// makes a new SimpleGui1 object 
    }
} 
