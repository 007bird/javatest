import javax.swing.*;
import java.awt.*;

class DrawArcPanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawArc(20,20,80,80,0,120);
        g.drawArc(20,40,80,80,0,-120);

        g.drawArc(150,20,80,80,180,-120);
        g.drawArc(150,40,80,80,180,120);
    }
}
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("繪製圓弧");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.add(new DrawArcPanel());
        frame.setVisible(true);
    }
}