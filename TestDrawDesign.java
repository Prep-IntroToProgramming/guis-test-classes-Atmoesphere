
import javax.swing.*;
import java.awt.*;
public class TestDrawDesign{
    JFrame frame; 
    Boolean move = true;
    Boolean brr = false; 
    drawdesign circle = new drawdesign();
    public TestDrawDesign(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new drawdesign());
        frame.add(circle);
        frame.setSize(500,500);
        frame.setVisible(true);
        while(move == true){
            if(circle.x==frame.getWidth()&&circle.y==frame.getHeight()){
                brr = false; 
            }
            if(circle.x==0&&circle.y==0){
                brr = true;
            }
            if(circle.x<frame.getWidth()&&circle.y<frame.getHeight()){
                circle.x++;
                circle.y++;
            }else{
                circle.x--;
                circle.y--;
            }
            frame.repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){

            }

        }
    }

    public static void main(String[] args){
        TestDrawDesign x = new TestDrawDesign();
    }

}