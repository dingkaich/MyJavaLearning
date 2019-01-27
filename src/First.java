//
//
//
//public class First   {
//
//
//    public String toString() {
//        return "good " + getClass().getName() + " class";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new First());
//        System.out.print("good\n");
//
//        for (String x :
//                args) {
//            System.out.println(x);
//
//        }
//
//
//    }
//}

import javax.swing.*;
import java.awt.*;

public class First extends JFrame {
    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("this is a jframe window");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200, 150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new First().CreateJFrame("dingkai");
    }

}