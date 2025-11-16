import javax.swing.*;//匯入 Swing 函式庫，裡面有 JFrame、JPanel 等 GUI（圖形介面）元件。
import java.awt.*;//匯入 AWT 函式庫（Abstract Window Toolkit），提供繪圖相關的 Graphics 類別與顏色設定。

class DrawRectanglePanel extends JPanel{//宣告一個新的類別 DrawRectanglePanel，繼承 JPanel（這樣才能成為畫圖的面板）。
    @Override//告訴編譯器：「我正在覆寫父類別的某個方法」。這樣如果拼錯名字（例如 paintComponet）就會報錯，幫助除錯。
    public void paintComponent(Graphics g){//定義 paintComponent() 方法。這是 Swing 中負責繪圖的主要方法，系統會自動呼叫它。Graphics g 就是畫筆（提供畫線、畫矩形、填色等功能）。
        super.paintComponent(g);
            g.drawRect(30,40,80,60);
            g.setColor(Color.BLACK);
            g.fillRect(140,40,80,60);
    }
}
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("繪製矩形");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.add(new DrawRectanglePanel());
        frame.setVisible(true);
    }
}
//import javax.swing.*;
//import java.awt.*;
//
//class DrawRectanglePanel extends JPanel{
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        g.drawRect(30,40,80,60);
//        g.setColor(Color.BLACK);
//        g.fillRect(140,40,80,60);
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        JFrame frame = new JFrame("繪製矩形");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,200);
//        frame.add(new DrawRectanglePanel());
//        frame.setVisible(true);
//    }
//}