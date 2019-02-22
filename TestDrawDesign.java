
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestDrawDesign{
    JFrame frame; 
    Boolean move = true;
    Boolean brr = false; 
    Boolean breshy = false;
    drawdesign circle = new drawdesign();
    Timer myTimer;
    public TestDrawDesign(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new drawdesign());
        frame.add(circle);
        frame.setSize(500,500);
        frame.setVisible(true);
        myTimer = new Timer(10, new TimerListener());
        myTimer.start();
    }

    class TimerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent w){
            //while(move == true){
            if(circle.x==frame.getWidth()-120){//||circle.y==frame.getHeight()-120){
                brr = false; 
            }
            if(circle.x==0){//&&circle.y==0){
                brr = true;
            }
            if(brr == true){
                circle.x++;
                //circle.y++;
            }else{
                circle.x--;
                //circle.y--;
            }

            if(circle.y==frame.getHeight()-120){
                breshy = false; 
            }
            if(circle.y==0){
                breshy = true;
            }
            if(breshy == true){

                circle.y++;
            }else{

                circle.y--;
            }
            frame.repaint();

            //}
        }
    }

    public static void main(String[] args){
        TestDrawDesign x = new TestDrawDesign();
    }

}