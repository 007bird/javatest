import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

class DrawQuadCurvePanel extends JPanel{
    public void paint(Graphics g)  {
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        QuadCurve2D.Double quadCurvel = new QuadCurve2D.Double(60,20,120,100,180,20);
        g2.draw(quadCurvel);
        QuadCurve2D.Double quadCurve2 = new QuadCurve2D.Double(60,120,120,40,180,120);
        g2.draw(quadCurve2);
    }
}

public class Main{
    public static void main(String[]args){
        JFrame frame =new JFrame("繪製二次曲線");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.add(new DrawQuadCurvePanel());
        frame.setVisible(true);
    }
}