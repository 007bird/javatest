import javax.swing.*;
import java.awt.*;

class DrawPolygonPanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int[] x1 = {100,120,180,140,150,110,50,60,20,80};
        int[] y1 ={20,85,90,120,180,140,180,120,90,85};
        int n1 =10;
        g.fillPolygon(x1,y1,n1);
        int[] x2 ={210,270,310,270,210,170};
        int[] y2 ={20,20,65,110,110,65};
        int n2 = 6;
        g.fillPolygon(x2,y2,n2);
        int[] x3 = {180,220,260,240,260,220,180,200};
        int[] y3 = {120,140,120,160,200,180,200,160};
        int n3 = 8;
        g.drawPolygon(x3,y3,n3);
    }
}
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("繪製多邊形");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.add(new DrawPolygonPanel());
        frame.setVisible(true);
    }
}