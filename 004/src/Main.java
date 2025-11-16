import javax.swing.*;
import java.awt.*;

class DrawEllipsePsePanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(30,20,80,50);
        g.drawOval(150,10,50,80);
        g.fillOval(40,90,50,80);
        g.fillOval(140,110,80,50);
    }
}

public class Main{
    public static void main(String[] args){
    JFrame frame = new JFrame("繪製圖片");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,250);
    frame.add(new DrawEllipsePsePanel());
    frame.setVisible(true);
    }
}
