import javax.swing.*;
import java.awt.*;
class DrawSectorPanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillArc(40,20,80,80,0,150);
        g.fillArc(150,20,80,80,180,-150);
        g.fillArc(40,40,80,80,0,-110);
        g.fillArc(140,40,80,80,180,110);
    }
}
public class Main{
    public static void main(String[] args){

        JFrame frame = new JFrame("繪製指定角度的填充扇形");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.add(new DrawSectorPanel());
        frame.setVisible(true);
    }
}