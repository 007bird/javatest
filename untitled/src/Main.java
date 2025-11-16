//import javax.swing.*;
//import java.awt.*;
//
//class DrawLinePanel extends JPanel{
//    @Override
//    protected void paintComponent(Graphics g){
//        super.paintComponent(g);
//
//        g.drawLine(70,50,180,50);
//        g.drawLine(70,80,180,80);
//        g.drawLine(110,10,140,120);
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        JFrame frame = new JFrame("畫線範例");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(250,200);
//        frame.add(new DrawLinePanel());
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
class DrawLinePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(70, 50, 180, 50);
        g.drawLine(70, 80, 180, 80);
        g.drawLine(110, 10, 140, 120);
    }
}
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("畫線範例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.add(new DrawLinePanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
