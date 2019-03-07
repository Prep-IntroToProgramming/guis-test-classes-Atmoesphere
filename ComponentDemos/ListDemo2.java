package ComponentDemos;

import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

class ListDemo2 {  

    JList<String> list; //new
    JLabel label; //old
    JScrollPane scroller; //new

    String names[] = {"David", "Isabella", "Matt", "Ty", "Kim", "Lawrence", "Sean"}; //old

    ListDemo2() {  
        JFrame frame = new JFrame("JList Demo");  
        frame.setLayout(new FlowLayout());  
        frame.setSize(200, 160);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        list = new JList<String>(names); 
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //new
        list.addListSelectionListener(new ListListener()); //new

        scroller = new JScrollPane(list); 
        scroller.setPreferredSize(new Dimension(120, 90)); 

        label = new JLabel("Please choose a name"); 

        frame.add(scroller); 
        frame.add(label); 
        frame.setVisible(true);  
    }  

    public static void main(String args[]) {  
        ListDemo2 ld = new ListDemo2();    
    }  

    class ListListener implements ListSelectionListener {//new
        public void valueChanged(ListSelectionEvent le) {  
            int[] index = list.getSelectedIndices(); //new
            String labelvalue = " ";
            for (int i: index){
                labelvalue = labelvalue +" "+ names[i];
            }
            if(!le.getValueIsAdjusting()) {
                label.setText("Current selection(s): " + labelvalue);
                if(index.length==7){
                    JFrame frame = new JFrame();
                    ImagePanel panel = new ImagePanel();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.add(panel);
                    frame.setSize(panel.logo.getIconWidth()+20,panel.logo.getIconHeight()+45);
                    frame.setVisible(true);
                }
            }
        }
    }
}

