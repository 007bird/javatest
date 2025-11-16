import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

class DrawSmoothHeartPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // 抗鋸齒
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.RED);

        // 在這裡調整位置與大小（左上 x,y；寬 w；高 h）
        Shape heart = buildHeart(50, 20, 200, 180);
        g2.fill(heart);
        // g2.setColor(Color.BLACK); g2.setStroke(new BasicStroke(2f)); g2.draw(heart); // 若想加外框
    }

    /** 建立一個圓潤、可縮放的愛心 Path（座標源自常見 SVG heart，轉成比例） */
    private Shape buildHeart(double x, double y, double w, double h) {
        Path2D.Double p = new Path2D.Double();
        // 起點：上方中間略下
        p.moveTo(x + 0.50*w, y + 0.2667*h);

        // 左邊上半曲線
        p.curveTo(
                x + 0.50*w, y + 0.2467*h,   // 控制點1
                x + 0.4667*w, y + 0.1667*h, // 控制點2
                x + 0.3333*w, y + 0.1667*h  // 終點
        );
        // 左側向下到左下
        p.curveTo(
                x + 0.1333*w, y + 0.1667*h,
                x + 0.1333*w, y + 0.4167*h,
                x + 0.1333*w, y + 0.4167*h
        );
        // 左下到底部中心
        p.curveTo(
                x + 0.1333*w, y + 0.5333*h,
                x + 0.2667*w, y + 0.6800*h,
                x + 0.50*w,   y + 0.8000*h
        );
        // 底部中心到右下
        p.curveTo(
                x + 0.7333*w, y + 0.6800*h,
                x + 0.8667*w, y + 0.5333*h,
                x + 0.8667*w, y + 0.4167*h
        );
        // 右側向上到右上
        p.curveTo(
                x + 0.8667*w, y + 0.4167*h,
                x + 0.8667*w, y + 0.1667*h,
                x + 0.6667*w, y + 0.1667*h
        );
        // 右上回到起點附近（完成「兩顆圓弧」）
        p.curveTo(
                x + 0.5667*w, y + 0.1667*h,
                x + 0.50*w,   y + 0.2467*h,
                x + 0.50*w,   y + 0.2667*h
        );
        p.closePath();
        return p;
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("圓潤的愛心");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 280);
        frame.add(new DrawSmoothHeartPanel());
        frame.setVisible(true);
    }
}
