import javax.swing.*;
import java.awt.*; 
import java.util.*; 
import java.awt.event.*; 
public class CheckBoxPractice implements ItemListener{
    JFrame frame;
    JLabel label; 
    JCheckBox cb1;
    JCheckBox cb2; 
    JCheckBox cb3;
    JCheckBox cb4; 
    JCheckBox cb5; 
    ArrayList<JCheckBox> box = new ArrayList<JCheckBox>(); 
    String text;
    public CheckBoxPractice(){
        frame = new JFrame();
        label = new JLabel("Nothing selected"); 
        cb1 = new JCheckBox("1");
        cb2 = new JCheckBox("2");
        cb3 = new JCheckBox("3");
        cb4 = new JCheckBox("4");
        cb5 = new JCheckBox("5");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.add(cb1);
        box.add(cb2); 
        box.add(cb3);
        box.add(cb4);
        box.add(cb5); 
        for(JCheckBox i: box){
            i.addItemListener(this);
        }
        frame.setSize(500,500); 
        frame.add(label);
        frame.add(cb1);
        frame.add(cb2); 
        frame.add(cb3); 
        frame.add(cb4);
        frame.add(cb5); 
        frame.setVisible(true);
        
    }

    public static void main(String[] args){
        CheckBoxPractice test = new CheckBoxPractice();
    }

    public void itemStateChanged(ItemEvent y){
        text = "You Selected: ";
        for(JCheckBox i: box){
            if(i.isSelected()){
                text = text+" "+ i.getText();  
            }
        }
        label.setText(text);
    }
}

/*in order to get the label to update when the check box is selected by using a 
an array list of check boxes with a for loop  */

