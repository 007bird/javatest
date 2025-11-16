import javax.swing.*;
import java.awt.*;

class DrawSquarePanel extends JPanel{
    @Override
    public void paint(Graphics g){
        g.drawRect(20,20,100,100);
        g.drawRect(40,40,60,60);
        g.drawRect(140,20,100,100);
        g.fillRect(160,40,60,60);
    }
}
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("繪製正方形");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawSquarePanel());
        frame.setVisible(true);
    }
}